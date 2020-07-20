package com.elimu.elimuappbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


public class School {
    private int id;
    private String schoolName;

    public School() {
    }

    public School(int id, String schoolName) {
        this.id = id;
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
