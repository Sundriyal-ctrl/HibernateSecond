package relatioship;


import com.Student;
import com.Subject;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
public class Marks
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;

  @ManyToOne
  Student student;

  @ManyToOne
  Subject subject;

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


}