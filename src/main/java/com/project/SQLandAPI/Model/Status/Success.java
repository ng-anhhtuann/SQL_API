package com.project.SQLandAPI.Model.Status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Success {
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("success")
    @Expose
    private String success;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getSuccess() {
        return success;
    }

    public Success(Boolean status, String success) {
        this.status = status;
        this.success = success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
