package com.project.SQLandAPI.Model.Insert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Teacher {
    @SerializedName("magv")
    @Expose
    private Integer magv;
    @SerializedName("hotengv")
    @Expose
    private String hotengv;
    @SerializedName("luong")
    @Expose
    private Double luong;
    @SerializedName("makhoa")
    @Expose
    private String makhoa;

    public Integer getMagv() {
        return magv;
    }

    public void setMagv(Integer magv) {
        this.magv = magv;
    }

    public String getHotengv() {
        return hotengv;
    }

    public void setHotengv(String hotengv) {
        this.hotengv = hotengv;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "magv=" + magv +
                ", hotengv='" + hotengv + '\'' +
                ", luong=" + luong +
                ", makhoa='" + makhoa + '\'' +
                '}';
    }

    public Teacher(Integer magv, String hotengv, Double luong, String makhoa) {
        this.magv = magv;
        this.hotengv = hotengv;
        this.luong = luong;
        this.makhoa = makhoa;
    }
}
