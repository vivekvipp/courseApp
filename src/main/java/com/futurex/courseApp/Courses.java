package com.futurex.courseApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
    @Id
    private Integer CUSTID;
    private String NAME;
    private String AUTHOR;

    public Courses() {
    }

    public Integer getCUSTID() {
        return CUSTID;
    }

    public void setCUSTID(Integer CUSTID) {
        this.CUSTID = CUSTID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }
}
