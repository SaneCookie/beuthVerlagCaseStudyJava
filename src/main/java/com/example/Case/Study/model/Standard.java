package com.example.Case.Study.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STANDARDS")
public class Standard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String dokNr;
    @Temporal(TemporalType.DATE)
    private Date issueDate;
    private String workingGrem;
    private String workingGremId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDokNr() {
        return dokNr;
    }

    public void setDokNr(String dokNr) {
        this.dokNr = dokNr;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getWorkingGrem() {
        return workingGrem;
    }

    public void setWorkingGrem(String workingGrem) {
        this.workingGrem = workingGrem;
    }

    public String getWorkingGremId() {
        return workingGremId;
    }

    public void setWorkingGremId(String workingGremId) {
        this.workingGremId = workingGremId;
    }
}

