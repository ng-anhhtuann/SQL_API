package com.project.SQLandAPI.Model.Insert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Title {
    @SerializedName("idTitle")
    @Expose
    private String idTitle;
    @SerializedName("nameTitle")
    @Expose
    private String nameTitle;
    @SerializedName("feeTitle")
    @Expose
    private Integer feeTitle;
    @SerializedName("siteTilte")
    @Expose
    private String siteTilte;

    public String getIdTitle() {
        return idTitle;
    }

    public void setIdTitle(String idTitle) {
        this.idTitle = idTitle;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public Integer getFeeTitle() {
        return feeTitle;
    }

    public void setFeeTitle(Integer feeTitle) {
        this.feeTitle = feeTitle;
    }

    public String getSiteTitle() {
        return siteTilte;
    }

    public void setSiteTitle(String siteTitle) {
        this.siteTilte = siteTilte;
    }

    @Override
    public String toString() {
        return "DeTai{" +
                "idTitle='" + idTitle + '\'' +
                ", nameTitle='" + nameTitle + '\'' +
                ", feeTilte=" + feeTitle +
                ", siteTilte='" + siteTilte + '\'' +
                '}';
    }

    public Title(String idTitle, String nameTitle, Integer feeTilte, String siteTilte) {
        this.idTitle = idTitle;
        this.nameTitle = nameTitle;
        this.feeTitle = feeTilte;
        this.siteTilte = siteTilte;
    }
}
