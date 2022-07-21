package com.project.SQLandAPI.Model.Query;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountFacultyName {
    @SerializedName("nameFaculty")
    @Expose
    private String nameFaculty;
    @SerializedName("numberOfStudents")
    @Expose
    private Integer numberOfStudents;

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public CountFacultyName(String nameFaculty, Integer numberOfStudents) {
        this.nameFaculty = nameFaculty;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "{" +
                "nameFaculty='" + nameFaculty + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
