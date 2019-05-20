import cn.jlw.entity.ShopCart;
import cn.jlw.service.MerchandiseService;
import cn.jlw.service.ShopCartService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-servelt.xml"})
public class ShopCartTest {

    @Test
    public void showShop() {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        ShopCartService merchandiseService
                =(ShopCartService) applicationContext.getBean("shopcartService");
        PageInfo<ShopCart> pageInfo = merchandiseService.showMerchandise(1, 20, 3);
        List<ShopCart> list = pageInfo.getList();
        if (list != null) {
            for (ShopCart shopCart : list) {
                System.out.println(shopCart.getId());
            }
        }
       
    }
}