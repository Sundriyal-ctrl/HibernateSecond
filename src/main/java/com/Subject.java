package com;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subject
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   int id;
   String subjectName;
   @ManyToMany(cascade = CascadeType.ALL,mappedBy = "studentSubjectRelation")
   List<Student> studentSubjectRelation;


   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getSubjectName() {
      return subjectName;
   }

   public void setSubjectName(String subjectName) {
      this.subjectName = subjectName;
   }

   public List<Student> getStudentSubjectRelation() {
      return studentSubjectRelation;
   }

   public void setStudentSubjectRelation(List<Student> studentSubjectRelation) {
      this.studentSubjectRelation = studentSubjectRelation;
   }
}