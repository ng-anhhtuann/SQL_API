package com.project.SQLandAPI.Model.Insert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Teacher {
    @SerializedName("idTeacher")
    @Expose
    private Integer idTeacher;
    @SerializedName("nameTeacher")
    @Expose
    private String nameTeacher;
    @SerializedName("salaryTeacher")
    @Expose
    private Double salaryTeacher;
    @SerializedName("idFaculty")
    @Expose
    private String idFaculty;

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public Double getSalaryTeacher() {
        return salaryTeacher;
    }

    public void setSalaryTeacher(Double salaryTeacher) {
        this.salaryTeacher = salaryTeacher;
    }

    public String getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(String idFaculty) {
        this.idFaculty = idFaculty;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "idTeacher=" + idTeacher +
                ", nameTeacher='" + nameTeacher + '\'' +
                ", salaryTeacher=" + salaryTeacher +
                ", idFaculty='" + idFaculty + '\'' +
                '}';
    }

    public Teacher(Integer idTeacher, String nameTeacher, Double salaryTeacher, String idFaculty) {
        this.idTeacher = idTeacher;
        this.nameTeacher = nameTeacher;
        this.salaryTeacher = salaryTeacher;
        this.idFaculty = idFaculty;
    }
}
