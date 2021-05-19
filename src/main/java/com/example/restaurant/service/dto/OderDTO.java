package com.example.restaurant.service.dto;

import java.sql.Date;
import java.io.Serializable;


public class OderDTO {
    
    private Long id;
    private int status;
    private Date created_at;
    private Long customer_id;
    private String description;
    private Long chef_id;

    public Long getChef_id() {
        return chef_id;
    }

    public Date getCreated_at() {
        return created_at;
    }
    
    public Long getCustomer_id() {
        return customer_id;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getStatus() {
        return status;
    }

    public void setChef_id(Long chef_id) {
        this.chef_id = chef_id;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public OderDTO(Long id, int status, Date created_at, Long customer_id, String description, Long chef_id) {
        this.id = id;
        this.status = status;
        this.created_at = created_at;
        this.customer_id = customer_id;
        this.description = description;
        this.chef_id = chef_id;
    }

    public OderDTO() {
    }
    

}
