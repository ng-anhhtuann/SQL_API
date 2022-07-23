package com.project.SQLandAPI.Model.Insert;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Faculty {
    @SerializedName("idFaculty")
    @Expose
    private String idFaculty;
    @SerializedName("nameFaculty")
    @Expose
    private String nameFaculty;
    @SerializedName("numberFaculty")
    @Expose
    private String numberFaculty;

    public String getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(String idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getNumberFaculty() {
        return numberFaculty;
    }

    public void setNumberFaculty(String numberFaculty) {
        this.numberFaculty = numberFaculty;
    }

    @Override
    public String toString() {
        return "Khoa{" +
                "idFaculty='" + idFaculty + '\'' +
                ", nameFaculty='" + nameFaculty + '\'' +
                ", numberFaculty='" + numberFaculty + '\'' +
                '}';
    }

    public Faculty(String idFaculty, String nameFaculty, String numberFaculty) {
        this.idFaculty = idFaculty;
        this.nameFaculty = nameFaculty;
        this.numberFaculty = numberFaculty;
    }
}
