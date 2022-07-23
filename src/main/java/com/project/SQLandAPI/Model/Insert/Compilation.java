package com.project.SQLandAPI.Model.Insert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Compilation {

    @SerializedName("idStudent")
    @Expose
    private Integer idStudent;
    @SerializedName("idTitle")
    @Expose
    private String idTitle;
    @SerializedName("idTeacher")
    @Expose
    private Integer idTeacher;
    @SerializedName("result")
    @Expose
    private Double result;

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getIdTitle() {
        return idTitle;
    }

    public void setIdTitle(String idTitle) {
        this.idTitle = idTitle;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "HuongDan{" +
                "idStudent=" + idStudent +
                ", idTitle='" + idTitle + '\'' +
                ", idTeacher=" + idTeacher +
                ", result=" + result +
                '}';
    }

    public Compilation(Integer idStudent, String idTitle, Integer idTeacher, Double result) {
        this.idStudent = idStudent;
        this.idTitle = idTitle;
        this.idTeacher = idTeacher;
        this.result = result;
    }
}
