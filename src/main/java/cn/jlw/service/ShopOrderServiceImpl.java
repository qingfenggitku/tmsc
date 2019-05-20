package cn.jlw.service;

import cn.jlw.dao.ShopOderMapper;
import cn.jlw.entity.ShopOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description： 订单的service
 * @author： 杨轩
 * @create： 2019/4/1 15:47:40
 */
@Service("shopOrderService")
public class ShopOrderServiceImpl implements ShopOrderService {
    @Resource
    ShopOderMapper shopOderMapper;
    @Override
    public Integer addShopOrder(ShopOrder shopOrder) {
        return shopOderMapper.addShopOrder(shopOrder);
    }

    @Override
    public ShopOrder getShopOrder(String OrderId) {
        return shopOderMapper.getShopOrder(OrderId);
    }

    @Override
    public ShopOrder searchOrder(String orderId) {
        return shopOderMapper.searchOrder(orderId);
    }

    @Override
    public Integer updateOrder(ShopOrder shopOrder) {
        return shopOderMapper.updateOrder(shopOrder);
    }

    @Override
    public Integer deleteOrder(String orderId) {
        return shopOderMapper.deleteOrder(orderId);
    }
}

