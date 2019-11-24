package com.jm.johnmollaghanteamworkapp.model.project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Project {

    @SerializedName("announcement")
    @Expose
    private String announcement;
    @SerializedName("announcementHTML")
    @Expose
    private String announcementHTML;
    @SerializedName("boardData")
    @Expose
    private BoardData boardData;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("created-on")
    @Expose
    private String createdOn;
    @SerializedName("defaultPrivacy")
    @Expose
    private String defaultPrivacy;
    @SerializedName("defaults")
    @Expose
    private Defaults defaults;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("filesAutoNewVersion")
    @Expose
    private Boolean filesAutoNewVersion;
    @SerializedName("harvest-timers-enabled")
    @Expose
    private Boolean harvestTimersEnabled;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("integrations")
    @Expose
    private Integrations integrations;
    @SerializedName("isOnBoardingProject")
    @Expose
    private Boolean isOnBoardingProject;
    @SerializedName("isProjectAdmin")
    @Expose
    private Boolean isProjectAdmin;
    @SerializedName("isSampleProject")
    @Expose
    private Boolean isSampleProject;
    @SerializedName("last-changed-on")
    @Expose
    private String lastChangedOn;
    @SerializedName("lastWorkedOn")
    @Expose
    private String lastWorkedOn;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("notifyeveryone")
    @Expose
    private Boolean notifyeveryone;
    @SerializedName("overview-start-page")
    @Expose
    private String overviewStartPage;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("people")
    @Expose
    private List<String> people = null;
    @SerializedName("portfolioBoards")
    @Expose
    private List<Object> portfolioBoards = null;
    @SerializedName("privacyEnabled")
    @Expose
    private Boolean privacyEnabled;
    @SerializedName("replyByEmailEnabled")
    @Expose
    private Boolean replyByEmailEnabled;
    @SerializedName("show-announcement")
    @Expose
    private Boolean showAnnouncement;
    @SerializedName("starred")
    @Expose
    private Boolean starred;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("start-page")
    @Expose
    private String startPage;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("subStatus")
    @Expose
    private String subStatus;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("tasks-start-page")
    @Expose
    private String tasksStartPage;

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getAnnouncementHTML() {
        return announcementHTML;
    }

    public void setAnnouncementHTML(String announcementHTML) {
        this.announcementHTML = announcementHTML;
    }

    public BoardData getBoardData() {
        return boardData;
    }

    public void setBoardData(BoardData boardData) {
        this.boardData = boardData;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getDefaultPrivacy() {
        return defaultPrivacy;
    }

    public void setDefaultPrivacy(String defaultPrivacy) {
        this.defaultPrivacy = defaultPrivacy;
    }

    public Defaults getDefaults() {
        return defaults;
    }

    public void setDefaults(Defaults defaults) {
        this.defaults = defaults;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getFilesAutoNewVersion() {
        return filesAutoNewVersion;
    }

    public void setFilesAutoNewVersion(Boolean filesAutoNewVersion) {
        this.filesAutoNewVersion = filesAutoNewVersion;
    }

    public Boolean getHarvestTimersEnabled() {
        return harvestTimersEnabled;
    }

    public void setHarvestTimersEnabled(Boolean harvestTimersEnabled) {
        this.harvestTimersEnabled = harvestTimersEnabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integrations getIntegrations() {
        return integrations;
    }

    public void setIntegrations(Integrations integrations) {
        this.integrations = integrations;
    }

    public Boolean getIsOnBoardingProject() {
        return isOnBoardingProject;
    }

    public void setIsOnBoardingProject(Boolean isOnBoardingProject) {
        this.isOnBoardingProject = isOnBoardingProject;
    }

    public Boolean getIsProjectAdmin() {
        return isProjectAdmin;
    }

    public void setIsProjectAdmin(Boolean isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
    }

    public Boolean getIsSampleProject() {
        return isSampleProject;
    }

    public void setIsSampleProject(Boolean isSampleProject) {
        this.isSampleProject = isSampleProject;
    }

    public String getLastChangedOn() {
        return lastChangedOn;
    }

    public void setLastChangedOn(String lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

    public String getLastWorkedOn() {
        return lastWorkedOn;
    }

    public void setLastWorkedOn(String lastWorkedOn) {
        this.lastWorkedOn = lastWorkedOn;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNotifyeveryone() {
        return notifyeveryone;
    }

    public void setNotifyeveryone(Boolean notifyeveryone) {
        this.notifyeveryone = notifyeveryone;
    }

    public String getOverviewStartPage() {
        return overviewStartPage;
    }

    public void setOverviewStartPage(String overviewStartPage) {
        this.overviewStartPage = overviewStartPage;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
    }

    public List<Object> getPortfolioBoards() {
        return portfolioBoards;
    }

    public void setPortfolioBoards(List<Object> portfolioBoards) {
        this.portfolioBoards = portfolioBoards;
    }

    public Boolean getPrivacyEnabled() {
        return privacyEnabled;
    }

    public void setPrivacyEnabled(Boolean privacyEnabled) {
        this.privacyEnabled = privacyEnabled;
    }

    public Boolean getReplyByEmailEnabled() {
        return replyByEmailEnabled;
    }

    public void setReplyByEmailEnabled(Boolean replyByEmailEnabled) {
        this.replyByEmailEnabled = replyByEmailEnabled;
    }

    public Boolean getShowAnnouncement() {
        return showAnnouncement;
    }

    public void setShowAnnouncement(Boolean showAnnouncement) {
        this.showAnnouncement = showAnnouncement;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getTasksStartPage() {
        return tasksStartPage;
    }

    public void setTasksStartPage(String tasksStartPage) {
        this.tasksStartPage = tasksStartPage;
    }

}
