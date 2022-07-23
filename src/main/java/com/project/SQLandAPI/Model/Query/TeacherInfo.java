package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeacherInfo {
    @Override
    public String toString() {
        return "{" +
                "idTeacher=" + idTeacher +
                ", nameTeacher='" + nameTeacher + '\'' +
                ", nameFaculty='" + nameFaculty + '\'' +
                '}';
    }

    public TeacherInfo(Integer idTeacher, String nameTeacher, String nameFaculty) {
        this.idTeacher = idTeacher;
        this.nameTeacher = nameTeacher;
        this.nameFaculty = nameFaculty;
    }

    @SerializedName("idTeacher")
    @Expose
    private Integer idTeacher;
    @SerializedName("nameTeacher")
    @Expose
    private String nameTeacher;
    @SerializedName("nameFaculty")
    @Expose
    private String nameFaculty;

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

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }
}
