package com.project.SQLandAPI.Model.Insert;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Khoa {
    @SerializedName("makhoa")
    @Expose
    private String makhoa;
    @SerializedName("tenkhoa")
    @Expose
    private String tenkhoa;
    @SerializedName("dienthoai")
    @Expose
    private String dienthoai;

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    @Override
    public String toString() {
        return "Khoa{" +
                "makhoa='" + makhoa + '\'' +
                ", tenkhoa='" + tenkhoa + '\'' +
                ", dienthoai='" + dienthoai + '\'' +
                '}';
    }

    public Khoa(String makhoa, String tenkhoa, String dienthoai) {
        this.makhoa = makhoa;
        this.tenkhoa = tenkhoa;
        this.dienthoai = dienthoai;
    }
}
