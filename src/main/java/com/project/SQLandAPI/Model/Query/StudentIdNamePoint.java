package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentIdNamePoint {
    @SerializedName("idStudent")
    @Expose
    private Integer idStudent;
    @SerializedName("nameStudent")
    @Expose
    private String nameStudent;
    @SerializedName("result")
    @Expose
    private Double result;

    public StudentIdNamePoint(Integer idStudent, String nameStudent, Double result) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.result = result;
    }

    @Override
    public String toString() {
        return "{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", result=" + result +
                '}';
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
