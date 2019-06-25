package com.temelt.issuemanagment.dto;

import com.temelt.issuemanagment.entity.IssueStatus;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class IssueDetailDto {

    @ApiModelProperty(required = true, value = "ID")
    private Long id;
    @ApiModelProperty(required = true, value = "Description")
    private String description;
    @ApiModelProperty(required = true, value = "Issue Details")
    private String details;
    @ApiModelProperty(required = true, value = "Date")
    private Date date;
    @ApiModelProperty(required = true, value = "Issue Status")
    private IssueStatus issueStatus;
    @ApiModelProperty(required = true, value = "Assignee")
    private UserDto assignee;
    @ApiModelProperty(required = true, value = "Project")
    private ProjectDto project;
    @ApiModelProperty(required = true, value = "Issue Histories")
    private List<IssueHistoryDto> issueHistories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public IssueStatus getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(IssueStatus issueStatus) {
        this.issueStatus = issueStatus;
    }

    public UserDto getAssignee() {
        return assignee;
    }

    public void setAssignee(UserDto assignee) {
        this.assignee = assignee;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

    public List<IssueHistoryDto> getIssueHistories() {
        return issueHistories;
    }

    public void setIssueHistories(List<IssueHistoryDto> issueHistories) {
        this.issueHistories = issueHistories;
    }

    public IssueDetailDto(Long id, String description, String details, Date date, IssueStatus issueStatus, UserDto assignee, ProjectDto project, List<IssueHistoryDto> issueHistories) {
        this.id = id;
        this.description = description;
        this.details = details;
        this.date = date;
        this.issueStatus = issueStatus;
        this.assignee = assignee;
        this.project = project;
        this.issueHistories = issueHistories;
    }

    public IssueDetailDto() {
    }
}