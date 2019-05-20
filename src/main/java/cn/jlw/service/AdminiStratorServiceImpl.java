package cn.jlw.service;

import cn.jlw.dao.AdministratorMapper;
import cn.jlw.entity.Administrator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description： 管理员的service
 * @author： 杨轩
 * @create： 2019/3/25 13:25:11
 */
@Service("administratorService")
public class AdminiStratorServiceImpl implements AdministratorService {
    @Resource
    private AdministratorMapper administratorMapper;
    @Override
    public Administrator login(Administrator administrator) {
        return administratorMapper.login(administrator);
    }

    @Override
    public Integer addAdministrator(Administrator administrator) {
        return administratorMapper.addAdministrator(administrator);
    }

    @Override
    public List<String> getNickName() {
        return administratorMapper.getNickName();
    }

    @Override
    public Integer updatePassword(String pwd, String phone) {
        return administratorMapper.updatePassword(pwd,phone);
    }

    @Override
    public PageInfo<Administrator> getAdministrators(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Administrator> list = administratorMapper.getAdministrators();
        PageInfo<Administrator> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Administrator> getAdministrator(String userName) {
        return administratorMapper.getAdministrator(userName);
    }
    //添加管理员
    @Override
    public Integer addManager(String userName) {
        return administratorMapper.addManager(userName);
    }
    //删除管理员
    @Override
    public Integer deleteManager(String userName) {
        return administratorMapper.deleteManager(userName);
    }

    @Override
    public Integer updateUser(Administrator administrator) {
        return administratorMapper.updateUser(administrator);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return administratorMapper.deleteUser(id);
    }

    @Override
    public Administrator checkUser(Integer id) {
        return administratorMapper.checkUser(id);
    }
}

