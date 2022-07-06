package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeTaiMaxKinhPhi {
    @Override
    public String toString() {
        return "DeTaiMaxKinhPhi{" +
                "madt='" + madt + '\'' +
                ", tendt='" + tendt + '\'' +
                '}';
    }

    @SerializedName("madt")
    @Expose
    private String madt;
    @SerializedName("tendt")
    @Expose
    private String tendt;

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

    public DeTaiMaxKinhPhi(String madt, String tendt) {
        this.madt = madt;
        this.tendt = tendt;
    }
}
