package com.project.SQLandAPI.Model.Insert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("idStudent")
    @Expose
    private Integer idStudent;
    @SerializedName("nameStudent")
    @Expose
    private String nameStudent;
    @SerializedName("idFaculty")
    @Expose
    private String idFaculty;
    @SerializedName("yearStudent")
    @Expose
    private Integer yearStudent;
    @SerializedName("addressStudent")
    @Expose
    private String addressStudent;

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

    public String getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(String idFaculty) {
        this.idFaculty = idFaculty;
    }

    public Integer getYearStudent() {
        return yearStudent;
    }

    public void setYearStudent(Integer yearStudent) {
        this.yearStudent = yearStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    @Override
    public String toString() {
        return "{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", idFaculty='" + idFaculty + '\'' +
                ", yearStudent=" + yearStudent +
                ", addressStudent='" + addressStudent + '\'' +
                '}';
    }

    public Student(Integer idStudent, String nameStudent, String idFaculty, Integer yearStudent, String addressStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.idFaculty = idFaculty;
        this.yearStudent = yearStudent;
        this.addressStudent = addressStudent;
    }
}
