package cn.jlw.dao;

import cn.jlw.entity.Merchandise;
import cn.jlw.entity.ShopCart;

import java.util.List;

/**
 * @Description:
 * @Author: 杨轩
 * @CreateDate: 2019/4/4 10:35
 */
public interface ShopCartMapper {

    Integer addShopCar(ShopCart shopCart);

    List<ShopCart> queryShopCart(Integer customerId);

    Integer removeShop(Integer merchandiseId);
}
