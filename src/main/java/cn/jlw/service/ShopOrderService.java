package cn.jlw.service;

import cn.jlw.entity.ShopOrder;

public interface ShopOrderService {
    Integer addShopOrder(ShopOrder shopOrder);

    ShopOrder getShopOrder(String OrderId);
    //管理员搜索订单
    ShopOrder searchOrder(String orderId);

    Integer updateOrder(ShopOrder shopOrder);

    Integer deleteOrder(String orderId);
}
