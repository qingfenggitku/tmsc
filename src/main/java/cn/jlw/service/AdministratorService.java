package cn.jlw.service;

import cn.jlw.entity.Administrator;
import cn.jlw.entity.Merchandise;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorService {
    Administrator login(Administrator administrator);

    Integer addAdministrator(Administrator administrator);

    List<String> getNickName();

    Integer updatePassword(@Param("pwd") String pwd, @Param("pwd") String phone);

    //查询所有用户
    PageInfo<Administrator> getAdministrators(Integer pageNum, Integer pageSize);
    //根据用户名模糊查询
    List<Administrator> getAdministrator(String userName);
    //添加管理员
    Integer addManager(String userName);
    //删除管理员
    Integer deleteManager(String userName);
    //更新用户信息
    Integer updateUser(Administrator administrator);
    //删除用户
    Integer deleteUser(Integer id);

    Administrator checkUser(Integer id);
}
