package com.msl.mybatis.entity;

public class OrgMsl {
    private Integer id;

    private String msl;

    private String hly;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsl() {
        return msl;
    }

    public void setMsl(String msl) {
        this.msl = msl == null ? null : msl.trim();
    }

    public String getHly() {
        return hly;
    }

    public void setHly(String hly) {
        this.hly = hly == null ? null : hly.trim();
    }
}