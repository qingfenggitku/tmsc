package cn.jlw.controller;

import cn.jlw.dao.MerchandiseMapper;
import cn.jlw.entity.Administrator;
import cn.jlw.entity.Merchandise;
import cn.jlw.entity.ShopOrder;
import cn.jlw.service.AdministratorService;
import cn.jlw.service.MerchandiseService;
import cn.jlw.service.ShopOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description：
 * @author： 杨轩
 * @create： 2019/3/27 17:19:37
 */
@Controller
@RequestMapping("merchandise")
public class MerchandiseContoller {
    @Autowired
    private MerchandiseMapper merchandiseMapper;
    @Autowired
    AdministratorService administratorService;
    @Autowired
    ShopOrderService shopOrderService;
    @RequestMapping(value = "addMerchangdis",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String addMerchandise( String  merchandiseName, String details, String price, String category, String number, String photo, String salesVolume,Model model) {
        Merchandise merchandise = new Merchandise();
        merchandise.setNumber(Integer.parseInt(number));
        merchandise.setPrice(Double.parseDouble(price));
        merchandise.setCategory(category);
        merchandise.setMerchandiseName(merchandiseName);
        Date date = new Date();
       /* SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = format.format(date);*/
        merchandise.setAddedTime(date);
        merchandise.setDetails(details);
        merchandise.setSalvesVolume(Long.parseLong(salesVolume));
        merchandise.setPhoto(photo);
        int count = 0;
        Map<String,String> map=new HashMap<>();
        count = merchandiseMapper.addMerchandise(merchandise);
        if (0 != count ) {
            model.addAttribute("message","成功");
        }else {
            model.addAttribute("message","录入信息有误请重新录入");;
        }
        return "addMerchandis";
    }

    //a标签跳转
    @RequestMapping("turnAddMerchandis")
    public String turnAdministor() {
        return "addMerchandis";
    }
    @Autowired
    MerchandiseService merchandiseService;
    //顾客查看货物
    @RequestMapping("list")
    public String userList(Integer pageNum,Integer pageSize,Model model) {
        if (pageNum == null || pageNum.equals("")) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 5;
        }
        PageInfo<Merchandise> merchandisesPageInfo = merchandiseService.merchandisesList(pageNum, pageSize);
        model.addAttribute("pageInfo", merchandisesPageInfo);
        return "merchandises";
    }

    //管理员查看货物
    @RequestMapping("adlist")
    public String adMerList(Integer pageNum,Integer pageSize,Model model) {
        if (pageNum == null || pageNum.equals("")) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 20;
        }
        PageInfo<Merchandise> merchandisesPageInfo = merchandiseService.researchAdMerchandis(pageNum,pageSize);
        model.addAttribute("pageInfo", merchandisesPageInfo);
        return "adminmerchandise";

    }

    //查询货物
    @RequestMapping(value = "research",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String findMerchandise(String kind,String condition, HttpSession session) {
        int choose = Integer.parseInt(kind);
        if (choose == 1) {
            List<Merchandise> merchandises = merchandiseMapper.findMerchandise(condition);
            if (null != merchandises) {
                session.setAttribute("list",merchandises);
                return "findMerchandise";
            }
        } else if (choose == 2) {
                    //成员
                   List<Administrator> administrator = administratorService.getAdministrator(condition);
                   session.setAttribute("list",administrator);
                    return "searchuser";

        } else if (choose == 3) {
                    //订单
                    ShopOrder shopOrder = shopOrderService.searchOrder(condition);
                    session.setAttribute("shoporder",shopOrder);
                    return "searchorder";
        }

        return "superadministator";
    }

    //更新时检查货物
    @RequestMapping(value = "check",produces = "application/json;charset=UTF-8")
    public String ckeckMerchandise(String id, HttpSession session) {
        Merchandise merchandise = merchandiseMapper.checkMerchandise(Integer.parseInt(id));
        if (null != merchandise) {
            session.setAttribute("merchandise",merchandise);
            return "updateMerchandise";
        }
        return "findMerchandise";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String updateMerchandise(Merchandise merchandise, HttpSession session) {
       int count = merchandiseMapper.updateMerchandise(merchandise);
        if (0 != count) {
            return "success";
        }
        session.setAttribute("message","更新失败");
        return "updateMerchandise";
    }

    @RequestMapping(value = "delete",produces = "application/json;charset=UTF-8")
    public String deleteMerchandise(String id, HttpSession session) {
        int count = merchandiseMapper.delectMerchanise(Integer.parseInt(id));
        if (0 != count) {
            return "success";
        }
        session.setAttribute("message","删除失败");
        return "updateMerchandise";
    }
}

