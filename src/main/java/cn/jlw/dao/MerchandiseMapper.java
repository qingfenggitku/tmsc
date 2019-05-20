package cn.jlw.dao;

import cn.jlw.entity.Merchandise;

import java.util.List;

/**
 * @description： 商品的mapper
 * @author： 杨轩
 * @create： 2019/3/27 15:09:01
 */
public interface MerchandiseMapper {
    Integer addMerchandise(Merchandise merchandise);

    Integer addMerchandiselist(List<Merchandise> merchandiseList);

    List<Merchandise> researchMerchandis();

    Merchandise getMerchandise(Integer merchandiseId);

    List<Merchandise> findMerchandise(String condition);

    Integer updateMerchandise(Merchandise merchandise);

    Integer delectMerchanise(Integer id);
    //修改时对照
    Merchandise checkMerchandise(Integer merchandiseId);

    List<Merchandise> researchAdMerchandis();
}

