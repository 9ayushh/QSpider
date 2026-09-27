package com.assignment.a5.model;

public class Student {
    private int studId;
    private String studName;
    private int year;

    @Override
    public String toString() {
        return studName + " " + year;
    }


    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
