package com.jm.johnmollaghanteamworkapp.model.project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Integrations {

    @SerializedName("microsoftConnectors")
    @Expose
    private MicrosoftConnectors microsoftConnectors;
    @SerializedName("onedrivebusiness")
    @Expose
    private Onedrivebusiness onedrivebusiness;
    @SerializedName("sharepoint")
    @Expose
    private Sharepoint sharepoint;
    @SerializedName("xero")
    @Expose
    private Xero xero;

    public MicrosoftConnectors getMicrosoftConnectors() {
        return microsoftConnectors;
    }

    public void setMicrosoftConnectors(MicrosoftConnectors microsoftConnectors) {
        this.microsoftConnectors = microsoftConnectors;
    }

    public Onedrivebusiness getOnedrivebusiness() {
        return onedrivebusiness;
    }

    public void setOnedrivebusiness(Onedrivebusiness onedrivebusiness) {
        this.onedrivebusiness = onedrivebusiness;
    }

    public Sharepoint getSharepoint() {
        return sharepoint;
    }

    public void setSharepoint(Sharepoint sharepoint) {
        this.sharepoint = sharepoint;
    }

    public Xero getXero() {
        return xero;
    }

    public void setXero(Xero xero) {
        this.xero = xero;
    }

}
