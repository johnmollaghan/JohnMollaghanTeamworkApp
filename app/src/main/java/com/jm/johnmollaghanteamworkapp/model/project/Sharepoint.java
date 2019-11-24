package com.jm.johnmollaghanteamworkapp.model.project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sharepoint {

    @SerializedName("account")
    @Expose
    private String account;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("folder")
    @Expose
    private String folder;
    @SerializedName("foldername")
    @Expose
    private String foldername;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getFoldername() {
        return foldername;
    }

    public void setFoldername(String foldername) {
        this.foldername = foldername;
    }

}
