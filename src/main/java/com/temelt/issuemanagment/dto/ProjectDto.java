package com.temelt.issuemanagment.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@ApiModel(value = "Project Data Transfer Object")
public class ProjectDto {

    @ApiModelProperty(value = "Project ID")
    private Long id;

    @NotNull
    @ApiModelProperty(required = true, value = "Name Of Project")
    private String projectName;

    @NotNull
    @ApiModelProperty(required = true, value = "Code Of Project")
    private String projectCode;

    public ProjectDto() {
    }

    public ProjectDto(Long id, String projectName, String projectCode) {

        this.id = id;
        this.projectName = projectName;
        this.projectCode = projectCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }
}
