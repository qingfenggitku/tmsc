
import cn.jlw.entity.Merchandise;
import cn.jlw.service.AdministratorService;
import cn.jlw.service.MerchandiseService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @description： 商品类的后台测试
 * @author： 杨轩
 * @create： 2019/3/27 15:43:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-servelt.xml"})
public class MerchandiseTest {
    @Test
    public void addMerhandise() throws Exception {
        List<Merchandise> list = new ArrayList<>();
        Merchandise merchandise = new Merchandise();
        Date date = new Date();
        // 一、获取当前系统时间和日期并格式化输出:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String dateTime = df.format(date); // Formats a Date into a date/time string.
        merchandise.setDetails("aa");
        merchandise.setCategory("1");
        merchandise.setNumber(100);
        merchandise.setPrice(34);
        merchandise.setSalvesVolume(3);
        merchandise.setAddedTime(date);
        merchandise.setMerchandiseName("家具");
        list.add(merchandise);
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        MerchandiseService merchandiseService
                =(MerchandiseService) applicationContext.getBean("merchandiseService");
        int count =merchandiseService.addMerchandise(merchandise);
        if (0 != count ) {
            System.out.println(count);
        }
    }
    @Test
    public void addMerhandiseList() throws Exception {
        List<Merchandise> list = new ArrayList<>();
        Merchandise merchandise = new Merchandise();
        Date date = new Date();
        // 一、获取当前系统时间和日期并格式化输出:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String dateTime = df.format(date); // Formats a Date into a date/time string.
        merchandise.setDetails("aa");
        merchandise.setCategory("1");
        merchandise.setNumber(100);
        merchandise.setPrice(34);
        merchandise.setSalvesVolume(3);
        merchandise.setAddedTime(date);
        merchandise.setMerchandiseName("家具");
        list.add(merchandise);
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        MerchandiseService merchandiseService
                =(MerchandiseService) applicationContext.getBean("merchandiseService");
        int count =merchandiseService.addMerchandiselist(list);
        if (0 != count ) {
            System.out.println(count);
        }
    }
    @Test
    public void pageInfoMer() {
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        MerchandiseService merchandiseService
                =(MerchandiseService) applicationContext.getBean("merchandiseService");
        PageInfo<Merchandise> pageInfo = merchandiseService.merchandisesList(0, 5);
        List<Merchandise> page = pageInfo.getList();
        for (Merchandise merchandise : page) {
            System.out.println(merchandise);
        }
    }

    @Test
    public void findMer() {
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        MerchandiseService merchandiseService
                =(MerchandiseService) applicationContext.getBean("merchandiseService");
        List<Merchandise> pageInfo = merchandiseService.findMerchandise("毛");

        if (pageInfo != null) {
            for (Merchandise m:pageInfo) {
                System.out.println(m);
            }

        }
    }

    @Test
    public void updateMerchandise() {
        Merchandise merchandise = new Merchandise();
        merchandise.setId(4);
        merchandise.setPhoto("f6a5fd284618c0e4d8e89246d95664b4.jpg");
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        MerchandiseService merchandiseService
                =(MerchandiseService) applicationContext.getBean("merchandiseService");

        int count = merchandiseService.updateMerchandise(merchandise);
        if (count != 0) {
            System.out.println(count);
        }
    }
}

