package com;

//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "relation")
//public class StudentSubjectRelation {
//    @Id
//    int id;
//    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "studentSubjectRelation")
//    List<Student> studentId=new ArrayList<>();
//
//    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "studentSubjectRelation")
//    List<Subject> subjectId=new ArrayList<>();
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public List<Student> getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(List<Student> studentId) {
//        this.studentId = studentId;
//    }
//
//    public List<Subject> getSubjectId() {
//        return subjectId;
//    }
//
//    public void setSubjectId(List<Subject> subjectId) {
//        this.subjectId = subjectId;
//    }
//}
