package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentIdNamePoint {
    @SerializedName("masv")
    @Expose
    private Integer masv;
    @SerializedName("hotensv")
    @Expose
    private String hotensv;
    @SerializedName("ketqua")
    @Expose
    private Double ketqua;

    public StudentIdNamePoint(Integer masv, String hotensv, Double ketqua) {
        this.masv = masv;
        this.hotensv = hotensv;
        this.ketqua = ketqua;
    }

    @Override
    public String toString() {
        return "MaTenDiem{" +
                "masv=" + masv +
                ", hotensv='" + hotensv + '\'' +
                ", ketqua=" + ketqua +
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

    public Double getKetqua() {
        return ketqua;
    }

    public void setKetqua(Double ketqua) {
        this.ketqua = ketqua;
    }
}
