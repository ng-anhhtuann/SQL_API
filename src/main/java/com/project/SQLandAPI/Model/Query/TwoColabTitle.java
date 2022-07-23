package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TwoColabTitle {

    @SerializedName("idTitle")
    @Expose
    private Integer idTitle;

    @Override
    public String toString() {
        return "{" +
                "idTitle=" + idTitle +
                ", nameTitle='" + nameTitle + '\'' +
                '}';
    }

    public TwoColabTitle(Integer idTitle, String nameTitle) {
        this.idTitle = idTitle;
        this.nameTitle = nameTitle;
    }

    @SerializedName("nameTitle")
    @Expose
    private String nameTitle;

    public Integer getIdTitle() {
        return idTitle;
    }

    public void setIdTitle(Integer idTitle) {
        this.idTitle = idTitle;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }
}
