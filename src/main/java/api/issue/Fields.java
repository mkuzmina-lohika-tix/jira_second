package api.issue;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fields implements IssueInterface {
    public Project project;
    public String summary;
    @JsonProperty("issuetype")
    public IssueType issueType;
    public Assignee assignee;

    public Fields() {
    }

    public Fields setProject(String projectId) {
        this.project = new Project(projectId);
        return this;
    }

    public Fields setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public Fields setIssueType(String issueType) {
        this.issueType = new IssueType(issueType);
        return this;
    }

    public Fields setAssignee(String assignee) {
        this.assignee = new Assignee(assignee);
        return this;
    }
}
