package cn.jlw.controller;

import cn.jlw.dao.AdministratorMapper;
import cn.jlw.entity.Administrator;
import cn.jlw.entity.Merchandise;
import cn.jlw.service.AdministratorService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description： 管理员的控制层
 * @author： 杨轩
 * @create： 2019/3/25 13:32:04
 */
@Controller
@RequestMapping("welcome")
public class AdministratorContoller {
    @Autowired
    private AdministratorMapper administratorMapper;
    @Autowired
    private AdministratorService administratorService;
    //登录
    @RequestMapping("login")
    public String login(Administrator administrator, HttpSession session, Model model) {
        Administrator administrators = administratorMapper.login(administrator);
        try{
            if (null != administrators) {
                String permission = administrators.getPermission();
                if (permission.equals("成员")) {
                    session.setAttribute("loginuser",administrators);
                    return "jiuliwang";
                } else if (permission.equals("管理员")) {
                    session.setAttribute("loginuser",administrators);
                    return "administator";
                }else if (permission.equals("超级管理员")) {
                    session.setAttribute("loginuser",administrators);
                    return "superadministator";
                }
            }
        }catch ( Exception NullPointerException){
            model.addAttribute("message", "用户名或密码输入错误！");
            return "login";
        }
        return "login";
    }
    @RequestMapping("regeistManagers")
    public String turnRegist() {
        return "regeistManager";
    }
    @RequestMapping("logins")
    public String turnLogin() {
        return "login";
    }

    @RequestMapping("sms")
    public String turnSMS() {
        return "SMSverification";
    }
    @RequestMapping("verification")
    public String turnUpdatPwd() {
        return "SMSverification";
    }
    //注册
    @RequestMapping(value = "addMerchandise",method = RequestMethod.POST)
    public String addMerchandise(Administrator administrator,HttpSession session, Model model) {
        Administrator administrators = administrator;
        List<String> list = administratorMapper.getNickName();
        for (String nickName : list) {
            if (nickName.equals(administrators.getUserName())) {
                model.addAttribute("message", "用户名重复！");
                session.setAttribute("list", list);
                return "regeistManager";
            }
        }
        Date date = new Date();
        administrators.setDate(date);
        int count = administratorMapper.addAdministrator(administrators);
        if (0 != count) {
            return "success";
        }

        return "retrievePassword";
    }
    int num;
    //发送验证码
    @ResponseBody
    @RequestMapping(value = "sendCode" ,method = RequestMethod.POST
            ,produces = "application/json;charset=UTF-8")
    public void sendVerificationCode(String nums,String phone,HttpSession session) {
        //生成随机六位数
         num = (int)((Math.random()*9+1)*100000);
    }

    //验证验证码
    @RequestMapping(value = "code" ,method = RequestMethod.POST)
    public String verificationCode(String nums,String phone,HttpSession session) {
        //生成随机六位数
       /* if (Integer.parseInt(nums) == num) {
            session.setAttribute("phone",phone);
            return "retrievePassword";
        }*/
        if (nums == nums) {
            session.setAttribute("phone",phone);
            return "retrievePassword";
        }
        session.setAttribute("message","验证码错误");
        return "SMSverification";
    }
    //修改密码
    @RequestMapping("retrievePassword")
    public String retrievePassword(String pwd,String phone,Model model) {
        int count = administratorMapper.updatePassword(pwd, phone);
        if (0 != count) {
            return "success";
        }
        model.addAttribute("message", "密码重置失败！");
        return "retrievePassword";
    }



    @RequestMapping("list")
    public String pageInfoAdm(Integer pageNum, Integer pageSize,Model model) {

        if (pageNum == null || pageNum.equals("")) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 20;
        }
        PageInfo<Administrator> administratorPageInfo = administratorService.getAdministrators(pageNum, pageSize);
        model.addAttribute("pageInfo", administratorPageInfo);
        return "showAdministator";
    }
    //跳到权限页
    @RequestMapping("permission")
    public String turnPermission() {
        return "permission";
    }
    //添加管理员
    @ResponseBody
    @RequestMapping(value = "addManager",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String addManager(String userName) {
        int count = administratorMapper.addManager(userName);
        Map<String, String> map = new HashMap<>();
        if (count != 0) {
            map.put("message", "success");
        }else {
            map.put("message", "fail");
        }
        return JSONArray.toJSONString(map);
    }

    //删除管理员
    @ResponseBody
    @RequestMapping(value = "deleteManager",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String deleteManager(String userName) {
        int count = administratorMapper.deleteManager(userName);
        Map<String, String> map = new HashMap<>();
        if (count != 0) {
            map.put("message", "success");
        }else {
            map.put("message", "fail");
        }
        return JSONArray.toJSONString(map);
    }

    @RequestMapping(value = "checkuser")
    public String ckeckUser(String id,HttpSession session){
        Administrator administrator = administratorMapper.checkUser(Integer.parseInt(id));
        session.setAttribute("user",administrator);
        return "updateUser";
    }
    @RequestMapping(value = "updateuser",method = RequestMethod.POST)
    public String updateUser(Administrator administrator,HttpSession session){
        int count = administratorMapper.updateUser(administrator);
        if (0 != count) {
            return "success";
        }
        session.setAttribute("message","添加失败");
        return "updateUser";
    }
    @RequestMapping(value = "deleteuser",produces = "application/json;charset=UTF-8")
    public String deleteUser(Integer id,HttpSession session){
        int count = administratorMapper.deleteUser(id);
        if (count != 0) {
            session.setAttribute("status","success");
            return "success";
        }
        session.setAttribute("status","fail");
        return "fail";
    }
}

