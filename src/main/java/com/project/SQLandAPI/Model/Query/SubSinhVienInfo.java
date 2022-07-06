package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubSinhVienInfo {
    @SerializedName("masv")
    @Expose
    private Integer masv;
    @SerializedName("hotensv")
    @Expose
    private String hotensv;
    @SerializedName("tuoi")
    @Expose
    private Integer tuoi;

    @Override
    public String toString() {
        return "SubSinhVienInfo{" +
                "masv=" + masv +
                ", hotensv='" + hotensv + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

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

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public SubSinhVienInfo(Integer masv, String hotensv, Integer tuoi) {
        this.masv = masv;
        this.hotensv = hotensv;
        this.tuoi = tuoi;
    }
}
