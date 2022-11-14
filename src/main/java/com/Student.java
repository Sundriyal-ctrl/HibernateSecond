package com;


import relatioship.Marks;
import relatioship.student_s_m;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int studentId;
    String name;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Subject> studentSubjectRelation=new ArrayList<>();
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getStudentSubjectRelation() {
        return studentSubjectRelation;
    }

    public void setStudentSubjectRelation(List<Subject> studentSubjectRelation) {
        this.studentSubjectRelation = studentSubjectRelation;
    }
}
