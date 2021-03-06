package com.temelt.issuemanagment.dto;

import com.temelt.issuemanagment.entity.IssueStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "Issue Data Transfer Oject")
public class IssueDto {
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
    private Long projectId;


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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }


    public IssueDto() {
    }

    public IssueDto(Long id, String description, String details, Date date, IssueStatus issueStatus, UserDto assignee, ProjectDto project, Long projectId) {
        this.id = id;
        this.description = description;
        this.details = details;
        this.date = date;
        this.issueStatus = issueStatus;
        this.assignee = assignee;
        this.project = project;
        this.projectId = projectId;
    }
}
