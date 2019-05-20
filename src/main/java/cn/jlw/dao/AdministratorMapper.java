package cn.jlw.dao;

import cn.jlw.entity.Administrator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorMapper {
    Administrator login(Administrator administrator);

    //添加用户
    Integer addAdministrator(Administrator administrator);

    List<String> getNickName();

    Integer updatePassword(@Param("pwd") String pwd, @Param("phone") String phone);
    //查询所有用户
    List<Administrator> getAdministrators();
    //根据用户名模糊查询
    List<Administrator> getAdministrator(String userName);

    //添加管理员
    Integer addManager(String userName);
    //删除管理员
    Integer deleteManager(String userName);

    Administrator checkUser(int id);
    //更新用户信息
    Integer updateUser(Administrator administrator);

    //删除用户
    Integer deleteUser(Integer id);

}
