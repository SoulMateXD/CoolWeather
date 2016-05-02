package com.zhangdesheng.coolweather.model;

/**
 * Created by Administrator on 2016/5/2.
 */
public class County {

    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public County(int id, String countyCode, String countyName, int cityId) {
        this.id = id;
        this.countyCode = countyCode;
        this.countyName = countyName;
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public County(){

    }
}
