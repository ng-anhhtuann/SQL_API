package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaxWorthTitle {
    @Override
    public String toString() {
        return "{" +
                "idTitle='" + idTitle + '\'' +
                ", nameTitle='" + nameTitle + '\'' +
                '}';
    }

    @SerializedName("idTitle")
    @Expose
    private String idTitle;
    @SerializedName("nameTitle")
    @Expose
    private String nameTitle;

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

    public MaxWorthTitle(String idTitle, String nameTitle) {
        this.idTitle = idTitle;
        this.nameTitle = nameTitle;
    }
}
