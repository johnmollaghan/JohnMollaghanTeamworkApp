package com.jm.johnmollaghanteamworkapp.model.project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TodoItem {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("canComplete")
    @Expose
    private Boolean canComplete;
    @SerializedName("comments-count")
    @Expose
    private Integer commentsCount;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("has-reminders")
    @Expose
    private Boolean hasReminders;
    @SerializedName("has-unread-comments")
    @Expose
    private Boolean hasUnreadComments;
    @SerializedName("private")
    @Expose
    private Integer _private;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("project-id")
    @Expose
    private Integer projectId;
    @SerializedName("project-name")
    @Expose
    private String projectName;
    @SerializedName("todo-list-id")
    @Expose
    private Integer todoListId;
    @SerializedName("todo-list-name")
    @Expose
    private String todoListName;
    @SerializedName("tasklist-private")
    @Expose
    private Boolean tasklistPrivate;
    @SerializedName("tasklist-isTemplate")
    @Expose
    private Boolean tasklistIsTemplate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("company-name")
    @Expose
    private String companyName;
    @SerializedName("company-id")
    @Expose
    private Integer companyId;
    @SerializedName("creator-id")
    @Expose
    private Integer creatorId;
    @SerializedName("creator-firstname")
    @Expose
    private String creatorFirstname;
    @SerializedName("creator-lastname")
    @Expose
    private String creatorLastname;
    @SerializedName("updater-id")
    @Expose
    private Integer updaterId;
    @SerializedName("updater-firstname")
    @Expose
    private String updaterFirstname;
    @SerializedName("updater-lastname")
    @Expose
    private String updaterLastname;
    @SerializedName("completed")
    @Expose
    private Boolean completed;
    @SerializedName("start-date")
    @Expose
    private String startDate;
    @SerializedName("due-date-base")
    @Expose
    private String dueDateBase;
    @SerializedName("due-date")
    @Expose
    private String dueDate;
    @SerializedName("created-on")
    @Expose
    private String createdOn;
    @SerializedName("last-changed-on")
    @Expose
    private String lastChangedOn;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("estimated-minutes")
    @Expose
    private Integer estimatedMinutes;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("progress")
    @Expose
    private Integer progress;
    @SerializedName("harvest-enabled")
    @Expose
    private Boolean harvestEnabled;
    @SerializedName("parentTaskId")
    @Expose
    private String parentTaskId;
    @SerializedName("lockdownId")
    @Expose
    private String lockdownId;
    @SerializedName("tasklist-lockdownId")
    @Expose
    private String tasklistLockdownId;
    @SerializedName("has-dependencies")
    @Expose
    private Integer hasDependencies;
    @SerializedName("has-predecessors")
    @Expose
    private Integer hasPredecessors;
    @SerializedName("hasTickets")
    @Expose
    private Boolean hasTickets;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("timeIsLogged")
    @Expose
    private String timeIsLogged;
    @SerializedName("attachments-count")
    @Expose
    private Integer attachmentsCount;
    @SerializedName("responsible-party-ids")
    @Expose
    private String responsiblePartyIds;
    @SerializedName("responsible-party-id")
    @Expose
    private String responsiblePartyId;
    @SerializedName("responsible-party-names")
    @Expose
    private String responsiblePartyNames;
    @SerializedName("responsible-party-type")
    @Expose
    private String responsiblePartyType;
    @SerializedName("responsible-party-firstname")
    @Expose
    private String responsiblePartyFirstname;
    @SerializedName("responsible-party-lastname")
    @Expose
    private String responsiblePartyLastname;
    @SerializedName("responsible-party-summary")
    @Expose
    private String responsiblePartySummary;
    @SerializedName("predecessors")
    @Expose
    private List<Object> predecessors = null;
    @SerializedName("canEdit")
    @Expose
    private Boolean canEdit;
    @SerializedName("viewEstimatedTime")
    @Expose
    private Boolean viewEstimatedTime;
    @SerializedName("creator-avatar-url")
    @Expose
    private String creatorAvatarUrl;
    @SerializedName("canLogTime")
    @Expose
    private Boolean canLogTime;
    @SerializedName("userFollowingComments")
    @Expose
    private Boolean userFollowingComments;
    @SerializedName("userFollowingChanges")
    @Expose
    private Boolean userFollowingChanges;
    @SerializedName("DLM")
    @Expose
    private Integer dLM;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getCanComplete() {
        return canComplete;
    }

    public void setCanComplete(Boolean canComplete) {
        this.canComplete = canComplete;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHasReminders() {
        return hasReminders;
    }

    public void setHasReminders(Boolean hasReminders) {
        this.hasReminders = hasReminders;
    }

    public Boolean getHasUnreadComments() {
        return hasUnreadComments;
    }

    public void setHasUnreadComments(Boolean hasUnreadComments) {
        this.hasUnreadComments = hasUnreadComments;
    }

    public Integer getPrivate() {
        return _private;
    }

    public void setPrivate(Integer _private) {
        this._private = _private;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getTodoListId() {
        return todoListId;
    }

    public void setTodoListId(Integer todoListId) {
        this.todoListId = todoListId;
    }

    public String getTodoListName() {
        return todoListName;
    }

    public void setTodoListName(String todoListName) {
        this.todoListName = todoListName;
    }

    public Boolean getTasklistPrivate() {
        return tasklistPrivate;
    }

    public void setTasklistPrivate(Boolean tasklistPrivate) {
        this.tasklistPrivate = tasklistPrivate;
    }

    public Boolean getTasklistIsTemplate() {
        return tasklistIsTemplate;
    }

    public void setTasklistIsTemplate(Boolean tasklistIsTemplate) {
        this.tasklistIsTemplate = tasklistIsTemplate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorFirstname() {
        return creatorFirstname;
    }

    public void setCreatorFirstname(String creatorFirstname) {
        this.creatorFirstname = creatorFirstname;
    }

    public String getCreatorLastname() {
        return creatorLastname;
    }

    public void setCreatorLastname(String creatorLastname) {
        this.creatorLastname = creatorLastname;
    }

    public Integer getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Integer updaterId) {
        this.updaterId = updaterId;
    }

    public String getUpdaterFirstname() {
        return updaterFirstname;
    }

    public void setUpdaterFirstname(String updaterFirstname) {
        this.updaterFirstname = updaterFirstname;
    }

    public String getUpdaterLastname() {
        return updaterLastname;
    }

    public void setUpdaterLastname(String updaterLastname) {
        this.updaterLastname = updaterLastname;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDueDateBase() {
        return dueDateBase;
    }

    public void setDueDateBase(String dueDateBase) {
        this.dueDateBase = dueDateBase;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getLastChangedOn() {
        return lastChangedOn;
    }

    public void setLastChangedOn(String lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getEstimatedMinutes() {
        return estimatedMinutes;
    }

    public void setEstimatedMinutes(Integer estimatedMinutes) {
        this.estimatedMinutes = estimatedMinutes;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Boolean getHarvestEnabled() {
        return harvestEnabled;
    }

    public void setHarvestEnabled(Boolean harvestEnabled) {
        this.harvestEnabled = harvestEnabled;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public String getLockdownId() {
        return lockdownId;
    }

    public void setLockdownId(String lockdownId) {
        this.lockdownId = lockdownId;
    }

    public String getTasklistLockdownId() {
        return tasklistLockdownId;
    }

    public void setTasklistLockdownId(String tasklistLockdownId) {
        this.tasklistLockdownId = tasklistLockdownId;
    }

    public Integer getHasDependencies() {
        return hasDependencies;
    }

    public void setHasDependencies(Integer hasDependencies) {
        this.hasDependencies = hasDependencies;
    }

    public Integer getHasPredecessors() {
        return hasPredecessors;
    }

    public void setHasPredecessors(Integer hasPredecessors) {
        this.hasPredecessors = hasPredecessors;
    }

    public Boolean getHasTickets() {
        return hasTickets;
    }

    public void setHasTickets(Boolean hasTickets) {
        this.hasTickets = hasTickets;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getTimeIsLogged() {
        return timeIsLogged;
    }

    public void setTimeIsLogged(String timeIsLogged) {
        this.timeIsLogged = timeIsLogged;
    }

    public Integer getAttachmentsCount() {
        return attachmentsCount;
    }

    public void setAttachmentsCount(Integer attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }

    public String getResponsiblePartyIds() {
        return responsiblePartyIds;
    }

    public void setResponsiblePartyIds(String responsiblePartyIds) {
        this.responsiblePartyIds = responsiblePartyIds;
    }

    public String getResponsiblePartyId() {
        return responsiblePartyId;
    }

    public void setResponsiblePartyId(String responsiblePartyId) {
        this.responsiblePartyId = responsiblePartyId;
    }

    public String getResponsiblePartyNames() {
        return responsiblePartyNames;
    }

    public void setResponsiblePartyNames(String responsiblePartyNames) {
        this.responsiblePartyNames = responsiblePartyNames;
    }

    public String getResponsiblePartyType() {
        return responsiblePartyType;
    }

    public void setResponsiblePartyType(String responsiblePartyType) {
        this.responsiblePartyType = responsiblePartyType;
    }

    public String getResponsiblePartyFirstname() {
        return responsiblePartyFirstname;
    }

    public void setResponsiblePartyFirstname(String responsiblePartyFirstname) {
        this.responsiblePartyFirstname = responsiblePartyFirstname;
    }

    public String getResponsiblePartyLastname() {
        return responsiblePartyLastname;
    }

    public void setResponsiblePartyLastname(String responsiblePartyLastname) {
        this.responsiblePartyLastname = responsiblePartyLastname;
    }

    public String getResponsiblePartySummary() {
        return responsiblePartySummary;
    }

    public void setResponsiblePartySummary(String responsiblePartySummary) {
        this.responsiblePartySummary = responsiblePartySummary;
    }

    public List<Object> getPredecessors() {
        return predecessors;
    }

    public void setPredecessors(List<Object> predecessors) {
        this.predecessors = predecessors;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public Boolean getViewEstimatedTime() {
        return viewEstimatedTime;
    }

    public void setViewEstimatedTime(Boolean viewEstimatedTime) {
        this.viewEstimatedTime = viewEstimatedTime;
    }

    public String getCreatorAvatarUrl() {
        return creatorAvatarUrl;
    }

    public void setCreatorAvatarUrl(String creatorAvatarUrl) {
        this.creatorAvatarUrl = creatorAvatarUrl;
    }

    public Boolean getCanLogTime() {
        return canLogTime;
    }

    public void setCanLogTime(Boolean canLogTime) {
        this.canLogTime = canLogTime;
    }

    public Boolean getUserFollowingComments() {
        return userFollowingComments;
    }

    public void setUserFollowingComments(Boolean userFollowingComments) {
        this.userFollowingComments = userFollowingComments;
    }

    public Boolean getUserFollowingChanges() {
        return userFollowingChanges;
    }

    public void setUserFollowingChanges(Boolean userFollowingChanges) {
        this.userFollowingChanges = userFollowingChanges;
    }

    public Integer getDLM() {
        return dLM;
    }

    public void setDLM(Integer dLM) {
        this.dLM = dLM;
    }

}
