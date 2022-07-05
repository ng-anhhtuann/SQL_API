package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GiangVienInfo {
    @Override
    public String toString() {
        return "GiangVienInfo{" +
                "magv=" + magv +
                ", hotengv='" + hotengv + '\'' +
                ", tenkhoa='" + tenkhoa + '\'' +
                '}';
    }

    public GiangVienInfo(Integer magv, String hotengv, String tenkhoa) {
        this.magv = magv;
        this.hotengv = hotengv;
        this.tenkhoa = tenkhoa;
    }

    @SerializedName("magv")
    @Expose
    private Integer magv;
    @SerializedName("hotengv")
    @Expose
    private String hotengv;
    @SerializedName("tenkhoa")
    @Expose
    private String tenkhoa;

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

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

}
