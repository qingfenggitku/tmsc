import cn.jlw.entity.Administrator;
import cn.jlw.service.AdministratorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description：
 * @author： 杨轩
 * @create： 2019/3/29 9:54:50
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-servelt.xml"})
public class CustomerTest {
    @Test
    public void addCustomer() throws Exception {
        Administrator customer = new Administrator();
        Date date = new Date();
      /*  // 一、获取当前系统时间和日期并格式化输出:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String dateTime = df.format(date); // Formats a Date into a date/time string.*/
        customer.setEmail("aa@aa.com");
        customer.setUserName("aa");
        customer.setPhoneNumber("11111");
        customer.setPwd("aaaa");
        customer.setDate(date);
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        AdministratorService customerService
                =(AdministratorService ) applicationContext.getBean("administratorService");
        int count =customerService.addAdministrator(customer);
        if (0 != count ) {
            System.out.println(count);
        }
    }
    @Test
    public void login() {
        Administrator administrator = new Administrator();
        administrator.setUserName("admin");
        administrator.setPwd("1234");
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        AdministratorService customerService
                =(AdministratorService ) applicationContext.getBean("administratorService");
        Administrator administrator1 =customerService.login(administrator);
        if (administrator1 != null) {
            System.out.println(administrator1);
        }else {
            System.out.println("用户名或密码错误");
        }
    }
    @Test
    public void getAdministrator() {
        List<String> list = new ArrayList<>();
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        AdministratorService customerService
                =(AdministratorService ) applicationContext.getBean("administratorService");
        list =customerService.getNickName();
        if (list != null) {
            System.out.println(list);
        }else {
            System.out.println("用户名或密码错误");
        }
    }

    @Test
    public void updatePassword() {
        String pwd = "12345";
        String phone = "15611111111";
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        AdministratorService customerService
                =(AdministratorService ) applicationContext.getBean("administratorService");
        int count =customerService.updatePassword(pwd,phone);
        if (count != 0) {
            System.out.println(count);
        }else {
            System.out.println("用户名或密码错误");
        }
    }
    @Test
    public void updateUser() {
        Administrator administrator = new Administrator();
        administrator.setId(3);
        administrator.setUserName("管理员");
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        AdministratorService customerService
                =(AdministratorService ) applicationContext.getBean("administratorService");
        int count =customerService.updateUser(administrator);
        if (count != 0) {
            System.out.println(count);
        }else {
            System.out.println("用户名或密码错误");
        }
    }

    @Test
    public void checkUser() {
        Administrator administrator = new Administrator();
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("springmvc-servelt.xml");
        AdministratorService customerService
                =(AdministratorService ) applicationContext.getBean("administratorService");
        administrator =customerService.checkUser(1);
        if (administrator != null) {
            System.out.println(administrator);
        }else {
            System.out.println("用户名或密码错误");
        }
    }
}

