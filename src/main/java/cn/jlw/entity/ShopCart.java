package cn.jlw.entity;

import java.util.Date;

/**
 * @Description: 购物车的实体类
 * @Author: 杨轩
 * @CreateDate: 2019/4/3 16:35
 */
public class ShopCart {
   private int id;
   private int merchandiseId;
   private Date createDate;
   private int customerId;
   private Merchandise merchandise;


    @Override
    public String toString() {
        return "ShopCart{" +
                "id=" + id +
                ", merchandiseId=" + merchandiseId +
                ", createDate=" + createDate +
                ", customerId=" + customerId +
                ", merchandise=" + merchandise +
                '}';
    }

    public Merchandise getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(Merchandise merchandise) {
        this.merchandise = merchandise;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(int merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
