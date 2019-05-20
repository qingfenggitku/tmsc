package cn.jlw.service;

import cn.jlw.dao.MerchandiseMapper;
import cn.jlw.entity.Merchandise;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description：
 * @author： 杨轩
 * @create： 2019/3/27 15:40:13
 */
@Service("merchandiseService")
public class MerchandiseServiceImpl implements MerchandiseService {
    @Resource
    MerchandiseMapper merchandiseMapper;
    @Override
    public Integer addMerchandise(Merchandise merchandise) {
        return merchandiseMapper.addMerchandise(merchandise);
    }

    @Override
    public Integer addMerchandiselist(List<Merchandise> merchandiseList) {
        return merchandiseMapper.addMerchandiselist(merchandiseList);
    }

    @Override
    public PageInfo<Merchandise> merchandisesList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Merchandise> merchandise = merchandiseMapper.researchMerchandis();
        PageInfo<Merchandise> pageInfo = new PageInfo<>(merchandise);
        return pageInfo;
    }

    @Override
    public Merchandise getMerchandise(Integer merchandiseId) {
        return merchandiseMapper.getMerchandise(merchandiseId);
    }

    @Override
    public List<Merchandise> findMerchandise(String condition) {
        return merchandiseMapper.findMerchandise(condition);
    }

    @Override
    public Integer updateMerchandise(Merchandise merchandise) {
        return merchandiseMapper.updateMerchandise(merchandise);
    }

    @Override
    public Integer delectMerchanise(Integer id) {
        return merchandiseMapper.delectMerchanise(id);
    }

    @Override
    public Merchandise checkMerchandise(Integer merchandiseId) {
        return merchandiseMapper.checkMerchandise(merchandiseId);
    }

    //管理员查询
    @Override
    public PageInfo<Merchandise> researchAdMerchandis(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Merchandise> list = merchandiseMapper.researchAdMerchandis();
        PageInfo<Merchandise> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}

