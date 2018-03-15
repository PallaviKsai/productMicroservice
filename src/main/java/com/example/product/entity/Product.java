package com.example.product.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class Product implements Serializable {

    public Product(String serviceId, String productName) {
        this.serviceId = serviceId;
        this.productName = productName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    protected String serviceId;

    protected String productName;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long uid;

}
