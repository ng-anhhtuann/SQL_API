package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountTenKhoa {
    @SerializedName("tenkhoa")
    @Expose
    private String tenkhoa;
    @SerializedName("soluongsv")
    @Expose
    private Integer soluongsv;

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public Integer getSoluongsv() {
        return soluongsv;
    }

    public void setSoluongsv(Integer soluongsv) {
        this.soluongsv = soluongsv;
    }

    public CountTenKhoa(String tenkhoa, Integer soluongsv) {
        this.tenkhoa = tenkhoa;
        this.soluongsv = soluongsv;
    }

    @Override
    public String toString() {
        return "CountTenKhoa{" +
                "tenkhoa='" + tenkhoa + '\'' +
                ", soluongsv=" + soluongsv +
                '}';
    }
}
