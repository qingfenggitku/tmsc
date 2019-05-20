import cn.jlw.entity.ShopOrder;
import cn.jlw.service.ShopOrderService;
import cn.jlw.utils.OrderId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @description：
 * @author： 杨轩
 * @create： 2019/4/1 15:43:33
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-servelt.xml"})
public class ShopOrderTest {
    @Test
    public void addShopOrder() throws Exception {
        ShopOrder shopOrder = new ShopOrder();
        Date date = new Date();
        // 一、获取当前系统时间和日期并格式化输出:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String dateTime = df.format(date); // Formats a Date into a date/time string.
        shopOrder.setCreateDate(date);
        shopOrder.setCustomerId(1);
        shopOrder.setDeliveryMethod("顺丰");
        shopOrder.setPayMethod("支付宝");
        shopOrder.setMerchandiseId(1);
        shopOrder.setRecipientPhone("123");
        shopOrder.setTelephone("123");
        shopOrder.setRecipientAddress("add");
        shopOrder.setRecipientName("张三");
        shopOrder.setOrderId(OrderId.getOrderIdByTime());
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        ShopOrderService shopOrderService
                = (ShopOrderService) applicationContext.getBean("shopOrderService");
        int count = shopOrderService.addShopOrder(shopOrder);
        if (0 != count) {
            System.out.println(count);
        }
    }

    @Test
    public void updateShopOrder() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-servelt.xml");

        ShopOrderService shopOrderService = (ShopOrderService) applicationContext.getBean("shopOrderService");

        ShopOrder shopOrder = new ShopOrder();
        shopOrder.setOrderId("1");
        shopOrder.setMerchandiseId(2);
        shopOrder.setRecipientAddress("xianan");
        int count = shopOrderService.updateOrder(shopOrder);
        if (count != 0) {
            System.out.println("修改成功！");
        }
    }
}

