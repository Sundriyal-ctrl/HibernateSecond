package relatioship;

import com.Zoo;
import org.hibernate.cfg.Configuration;

import javax.persistence.*;
import java.util.List;
import java.util.Properties;

@Entity
public class student_s_m
{
  @Id
  int id;
   String address;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "student_s_m{" +
            ""+id+
            ", address='" + address + '\'' +
            '}';
  }
}
