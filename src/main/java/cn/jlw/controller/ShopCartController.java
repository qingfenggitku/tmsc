package cn.jlw.controller;

import cn.jlw.dao.ShopCartMapper;
import cn.jlw.entity.ShopCart;
import cn.jlw.service.ShopCartService;
import cn.jlw.service.ShopOrderService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: 杨轩
 * @CreateDate: 2019/4/4 16:48
 */
@Controller
@RequestMapping("shopcart")
public class ShopCartController {
    @Autowired
    ShopCartMapper shopCartMapper;
    @ResponseBody
    @RequestMapping("addshop")
    public String addShop(String merchandiseId,String customerId) {
        String data;
       try {
           Date date = new Date();
           ShopCart shopCart = new ShopCart();
           shopCart.setCreateDate(date);
           shopCart.setCustomerId(Integer.parseInt(customerId));
           shopCart.setMerchandiseId(Integer.parseInt(merchandiseId));
           int count = shopCartMapper.addShopCar(shopCart);

           if (0 != count) {
               data = "1";
           }else {
               data = "0";
           }
       }catch (NumberFormatException e ){
           data = "0";
           return JSON.toJSONString(data);
       }

        return JSON.toJSONString(data);
    }
    @Autowired
    ShopCartService shopCartService;
    @RequestMapping(value = "showshop", method = RequestMethod.GET/*,
            produces = "application/json;charset=UTF-8"*/)
    public String showShopcart(String customerId,Integer pageSize,Integer pageNum, HttpSession session) {

        PageInfo<ShopCart> pageInfo = shopCartService.showMerchandise(pageSize,pageNum,Integer.parseInt(customerId));

        session.setAttribute("pageInfo",pageInfo);
        return "shopCart";
    }
}
