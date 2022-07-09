package com.project.SQLandAPI.Model.Insert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("masv")
    @Expose
    private Integer masv;
    @SerializedName("hotensv")
    @Expose
    private String hotensv;
    @SerializedName("makhoa")
    @Expose
    private String makhoa;
    @SerializedName("namsinh")
    @Expose
    private Integer namsinh;
    @SerializedName("quequan")
    @Expose
    private String quequan;

    public Integer getMasv() {
        return masv;
    }

    public void setMasv(Integer masv) {
        this.masv = masv;
    }

    public String getHotensv() {
        return hotensv;
    }

    public void setHotensv(String hotensv) {
        this.hotensv = hotensv;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public Integer getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(Integer namsinh) {
        this.namsinh = namsinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "masv=" + masv +
                ", hotensv='" + hotensv + '\'' +
                ", makhoa='" + makhoa + '\'' +
                ", namsinh=" + namsinh +
                ", quequan='" + quequan + '\'' +
                '}';
    }

    public Student(Integer masv, String hotensv, String makhoa, Integer namsinh, String quequan) {
        this.masv = masv;
        this.hotensv = hotensv;
        this.makhoa = makhoa;
        this.namsinh = namsinh;
        this.quequan = quequan;
    }
}
