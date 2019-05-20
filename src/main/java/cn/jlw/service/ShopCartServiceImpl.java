package cn.jlw.service;

import cn.jlw.dao.ShopCartMapper;
import cn.jlw.entity.Merchandise;
import cn.jlw.entity.ShopCart;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: 杨轩
 * @CreateDate: 2019/4/4 16:42
 */
@Service("shopcartService")
public class ShopCartServiceImpl implements ShopCartService {

    @Autowired
    ShopCartMapper shopCartMapper;
    @Override
    public Integer addShopCar(ShopCart shopCart) {
        return shopCartMapper.addShopCar(shopCart);
    }
    //显示购物车中的商品
    @Override
    public PageInfo<ShopCart> showMerchandise(Integer pageNum, Integer pageSize, Integer customerId) {
        PageHelper.startPage(pageNum, pageSize);
        List<ShopCart> merchandises = shopCartMapper.queryShopCart(customerId);
        PageInfo<ShopCart> pageInfo = new PageInfo<>(merchandises);
        return pageInfo;
    }
    @Override
    public Integer removeShop(Integer merchandiseId) {
        return null;
    }
}
