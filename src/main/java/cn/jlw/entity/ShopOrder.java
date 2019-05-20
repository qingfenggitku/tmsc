package cn.jlw.entity;

import java.util.Date;

/**
 * @description： 购物订单实体类
 * @author： 杨轩
 * @create： 2019/4/1 14:59:50
 */
public class ShopOrder {
    private int id;
    private int customerId;
    private String recipientName;
    private String recipientPhone;
    private String telephone;
    private String recipientAddress;
    private String payMethod;
    private String deliveryMethod;
    private int merchandiseId;
    private Date createDate;
    private String orderId;
    private Merchandise merchandise;
    private Administrator administrator;

    @Override
    public String toString() {
        return "ShopOrder{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", recipientName='" + recipientName + '\'' +
                ", recipientPhone='" + recipientPhone + '\'' +
                ", telephone='" + telephone + '\'' +
                ", recipientAddress='" + recipientAddress + '\'' +
                ", payMethod='" + payMethod + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                ", merchandiseId=" + merchandiseId +
                ", createDate=" + createDate +
                ", orderId='" + orderId + '\'' +
                ", merchandise=" + merchandise +
                ", administrator=" + administrator +
                '}';
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public Merchandise getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(Merchandise merchandise) {
        this.merchandise = merchandise;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
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

