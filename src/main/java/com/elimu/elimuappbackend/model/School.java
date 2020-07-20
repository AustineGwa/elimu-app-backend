package com.elimu.elimuappbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


public class School {
    private int id;
    private String school_id;
    private String school_name;

    public School() {
    }

    public School(int id, String school_id, String school_name) {
        this.id = id;
        this.school_id = school_id;
        this.school_name = school_name;
    }

    public String getSchool_id() {
        return school_id;
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }
}
