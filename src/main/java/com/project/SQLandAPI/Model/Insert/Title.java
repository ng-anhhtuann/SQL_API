package com.project.SQLandAPI.Model.Insert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Title {
    @SerializedName("madt")
    @Expose
    private String madt;
    @SerializedName("tendt")
    @Expose
    private String tendt;
    @SerializedName("kinhphi")
    @Expose
    private Integer kinhphi;
    @SerializedName("noithuctap")
    @Expose
    private String noithuctap;

    public String getMadt() {
        return madt;
    }

    public void setMadt(String madt) {
        this.madt = madt;
    }

    public String getTendt() {
        return tendt;
    }

    public void setTendt(String tendt) {
        this.tendt = tendt;
    }

    public Integer getKinhphi() {
        return kinhphi;
    }

    public void setKinhphi(Integer kinhphi) {
        this.kinhphi = kinhphi;
    }

    public String getNoithuctap() {
        return noithuctap;
    }

    public void setNoithuctap(String noithuctap) {
        this.noithuctap = noithuctap;
    }

    @Override
    public String toString() {
        return "DeTai{" +
                "madt='" + madt + '\'' +
                ", tendt='" + tendt + '\'' +
                ", kinhphi=" + kinhphi +
                ", noithuctap='" + noithuctap + '\'' +
                '}';
    }

    public Title(String madt, String tendt, Integer kinhphi, String noithuctap) {
        this.madt = madt;
        this.tendt = tendt;
        this.kinhphi = kinhphi;
        this.noithuctap = noithuctap;
    }
}
