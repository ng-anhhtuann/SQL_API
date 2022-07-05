package com.project.SQLandAPI.Model.Insert;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HuongDan {

    @SerializedName("masv")
    @Expose
    private Integer masv;
    @SerializedName("madt")
    @Expose
    private String madt;
    @SerializedName("magv")
    @Expose
    private Integer magv;
    @SerializedName("ketqua")
    @Expose
    private Double ketqua;

    public Integer getMasv() {
        return masv;
    }

    public void setMasv(Integer masv) {
        this.masv = masv;
    }

    public String getMadt() {
        return madt;
    }

    public void setMadt(String madt) {
        this.madt = madt;
    }

    public Integer getMagv() {
        return magv;
    }

    public void setMagv(Integer magv) {
        this.magv = magv;
    }

    public Double getKetqua() {
        return ketqua;
    }

    public void setKetqua(Double ketqua) {
        this.ketqua = ketqua;
    }

    @Override
    public String toString() {
        return "HuongDan{" +
                "masv=" + masv +
                ", madt='" + madt + '\'' +
                ", magv=" + magv +
                ", ketqua=" + ketqua +
                '}';
    }

    public HuongDan(Integer masv, String madt, Integer magv, Double ketqua) {
        this.masv = masv;
        this.madt = madt;
        this.magv = magv;
        this.ketqua = ketqua;
    }
}
