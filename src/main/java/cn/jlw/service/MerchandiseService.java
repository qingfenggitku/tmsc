package cn.jlw.service;

import cn.jlw.entity.Merchandise;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface MerchandiseService {
    Integer addMerchandise(Merchandise merchandise);

    Integer addMerchandiselist(List<Merchandise> merchandiseList);

    PageInfo<Merchandise> merchandisesList(Integer pageNum, Integer pageSize);

    Merchandise getMerchandise(Integer merchandiseId);

    List<Merchandise> findMerchandise(String condition);

    Integer updateMerchandise(Merchandise merchandise);

    Integer delectMerchanise(Integer id);

    Merchandise checkMerchandise(Integer merchandiseId);

    PageInfo<Merchandise> researchAdMerchandis(Integer pageNum, Integer pageSize);
}
