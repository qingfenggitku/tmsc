package cn.jlw.dao;

import cn.jlw.entity.ShopOrder;


public interface ShopOderMapper {
    Integer addShopOrder(ShopOrder shopOrder);

    //扫码时所需的订单内容
    ShopOrder getShopOrder(String OrderId);
    //管理员搜索订单
    ShopOrder searchOrder(String orderId);
    //更改订单
    Integer updateOrder(ShopOrder shopOrder);

    //删除订单
    Integer deleteOrder(String orderId);
}
