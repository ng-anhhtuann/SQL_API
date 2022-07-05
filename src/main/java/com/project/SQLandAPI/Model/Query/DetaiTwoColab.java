package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetaiTwoColab {

    @SerializedName("madt")
    @Expose
    private Integer madt;

    public DetaiTwoColab(Integer madt, String tendt) {
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
