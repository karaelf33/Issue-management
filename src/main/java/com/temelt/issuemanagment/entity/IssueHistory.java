package com.temelt.issuemanagment.entity;



import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "issue_history")
public class IssueHistory extends BaseEntity{

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "issue_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private Issue issue;

    @Column(name = "descripton",length = 1000)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @Column(name = "details",length = 40000)
    private String details;


    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User assignee;



    public IssueHistory(Issue issue, String description, Date date, IssueStatus issueStatus, String details, User assignee) {
        this.issue = issue;
        this.description = description;
        this.date = date;
        this.issueStatus = issueStatus;
        this.details = details;
        this.assignee = assignee;
    }

    public IssueHistory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
    @Override
    public String toString() {
        return "IssueHistory{" +
                "id=" + id +
                ", issue=" + issue +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", issueStatus=" + issueStatus +
                ", details='" + details + '\'' +
                ", assignee=" + assignee +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IssueHistory)) return false;
        IssueHistory that = (IssueHistory) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(issue, that.issue) &&
                Objects.equals(description, that.description) &&
                Objects.equals(date, that.date) &&
                issueStatus == that.issueStatus &&
                Objects.equals(details, that.details) &&
                Objects.equals(assignee, that.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, issue, description, date, issueStatus, details, assignee);
    }

}
