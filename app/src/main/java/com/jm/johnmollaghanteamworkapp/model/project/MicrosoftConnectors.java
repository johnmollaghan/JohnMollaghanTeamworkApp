package com.jm.johnmollaghanteamworkapp.model.project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MicrosoftConnectors {

    @SerializedName("enabled")
    @Expose
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}
