package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentSubInfo {
    @SerializedName("idStudent")
    @Expose
    private Integer idStudent;
    @SerializedName("nameStudent")
    @Expose
    private String nameStudent;
    @SerializedName("ageStudent")
    @Expose
    private Integer ageStudent;

    @Override
    public String toString() {
        return "{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", ageStudent=" + ageStudent +
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

    public Integer getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(Integer ageStudent) {
        this.ageStudent = ageStudent;
    }

    public StudentSubInfo(Integer idStudent, String nameStudent, Integer ageStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
    }
}
