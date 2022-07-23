package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TwoColabTitle {

    @SerializedName("madt")
    @Expose
    private Integer madt;

    @Override
    public String toString() {
        return "DetaiTwoColab{" +
                "madt=" + madt +
                ", tendt='" + tendt + '\'' +
                '}';
    }

    public TwoColabTitle(Integer madt, String tendt) {
        this.madt = madt;
        this.tendt = tendt;
    }

    @SerializedName("tendt")
    @Expose
    private String tendt;

    public Integer getMadt() {
        return madt;
    }

    public void setMadt(Integer madt) {
        this.madt = madt;
    }

    public String getTendt() {
        return tendt;
    }

    public void setTendt(String tendt) {
        this.tendt = tendt;
    }

}
