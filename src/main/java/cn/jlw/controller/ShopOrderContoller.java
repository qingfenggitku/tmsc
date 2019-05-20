package cn.jlw.controller;

import cn.jlw.dao.MerchandiseMapper;
import cn.jlw.dao.ShopOderMapper;
import cn.jlw.entity.Merchandise;
import cn.jlw.entity.ShopOrder;
import cn.jlw.utils.OrderId;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @description： 订单控制层
 * @author： 杨轩
 * @create： 2019/4/2 9:42:56
 */
@Controller
@RequestMapping("order")
public class ShopOrderContoller {
    @Autowired
    ShopOderMapper shopOderMapper;

    @ResponseBody
    @RequestMapping(value = "addOrder",method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8" )
    public String addOrder(
            String recipientName,
            String recipientAddress,
            String recipientPhone,
            String telephone,
            String payMethod,
            String deliveryMethod,
            String merchandiseId,
            String customerId
    ) {
        ShopOrder shopOrder = new ShopOrder();
        shopOrder.setRecipientName(recipientName);
        shopOrder.setRecipientAddress(recipientAddress);
        shopOrder.setRecipientPhone(recipientPhone);
        shopOrder.setMerchandiseId(Integer.parseInt(merchandiseId));
        shopOrder.setTelephone(telephone);
        shopOrder.setPayMethod(payMethod);
        shopOrder.setDeliveryMethod(deliveryMethod);
        shopOrder.setCustomerId(Integer.parseInt(customerId));
        Date date = new Date();
        shopOrder.setCreateDate(date);
        String orderId = OrderId.getOrderIdByTime();
        shopOrder.setOrderId(orderId);
        int count = shopOderMapper.addShopOrder(shopOrder);

        Map<String, Object> map = new HashMap<>();
        map.put("orderId", orderId);
        if (0 != count) {
            map.put("message", "ok");
        }else {
            map.put("message", "error");
        }
        return JSONArray.toJSONString(map);
    }

    @Autowired
    MerchandiseMapper merchandiseMapper;
    @RequestMapping("turnOrder")
    public String turnOrder(String merchandiseId, HttpSession session) {
        Merchandise merchandise = merchandiseMapper.getMerchandise(Integer.parseInt(merchandiseId));
        session.setAttribute("merchandise",merchandise);
        return "order";
    }

    @RequestMapping("turnupdateorder")
    public String turnupdateorder(String orderId,HttpSession session) {
        ShopOrder shopOrder = shopOderMapper.searchOrder(orderId);
        session.setAttribute("shoporder",shopOrder);
        return "updateorder";
    }
    //修改订单
    @RequestMapping(value = "updateorder",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String updateorder(ShopOrder shopOrder,HttpSession session) {
        int count = shopOderMapper.updateOrder(shopOrder);
        if (count != 0) {
            return "success";
        }
        session.setAttribute("message", "修改失败！");
        return "updateorder";
    }

    //修改订单
    @RequestMapping(value = "deleteorder",produces = "application/json;charset=UTF-8")
    public String updateorder(String orderId,HttpSession session) {
        int count = shopOderMapper.deleteOrder(orderId);
        if (count != 0) {
            return "success";
        }
        session.setAttribute("message", "删除失败！");
        return "updateorder";
    }
}

