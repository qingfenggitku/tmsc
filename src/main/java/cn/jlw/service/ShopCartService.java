package cn.jlw.service;

import cn.jlw.entity.Merchandise;
import cn.jlw.entity.ShopCart;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description:
 * @Author: 杨轩
 * @CreateDate: 2019/4/4$ 16:41$
 * @Version: 1.0
 */
public interface ShopCartService {
    Integer addShopCar(ShopCart shopCart);

    PageInfo<ShopCart> showMerchandise(Integer pageNum, Integer pageSize, Integer customerId);

    Integer removeShop(Integer merchandiseId);
}
