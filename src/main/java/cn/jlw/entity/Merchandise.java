package cn.jlw.entity;

/**
 * @description： 商品实类
 * @author： 杨轩
 * @create： 2019/3/27 14:59:14
 */

import java.util.Date;

public class Merchandise {
    private int id;
    private String  merchandiseName;
    private String details;
    private double price;
    private String category; //商品类别
    private long number;  //商品数量
    private Date addedTime; //商品上架时间
    private long salesVolume; //销量
    private String photo;
    private ShopCart shopCart;

    @Override
    public String toString() {
        return "Merchandise{" +
                "id=" + id +
                ", merchandiseName='" + merchandiseName + '\'' +
                ", details='" + details + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", number=" + number +
                ", addedTime=" + addedTime +
                ", salesVolume=" + salesVolume +
                ", photo='" + photo + '\'' +
                ", shopCart=" + shopCart +
                '}';
    }

    public ShopCart getShopCart() {
        return shopCart;
    }

    public void setShopCart(ShopCart shopCart) {
        this.shopCart = shopCart;
    }

    public long getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(long salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerchandiseName() {
        return merchandiseName;
    }

    public void setMerchandiseName(String merchandiseName) {
        this.merchandiseName = merchandiseName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public long getSalvesVolume() {
        return salesVolume;
    }

    public void setSalvesVolume(long salesVolume) {
        this.salesVolume = salesVolume;
    }
}

