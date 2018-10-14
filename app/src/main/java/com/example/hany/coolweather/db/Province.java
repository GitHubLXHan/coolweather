package com.example.hany.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author 6小h
 * @e-mail 1026310040@qq.com
 * @date 2018/10/14 20:53
 * @filName City
 * @describe ...
 */

public class Province extends DataSupport{

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return this.provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
