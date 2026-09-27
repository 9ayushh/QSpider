package com.assignment.a5.model;

import java.util.List;

public class College {
    private List<Student> students;
    private static String collegeName = "IIT Madras";
    private Principal princyName;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Principal getPrincyName() {
        return princyName;
    }

    public void setPrincyName(Principal princyName) {
        this.princyName = princyName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        College.collegeName = collegeName;
    }
}
