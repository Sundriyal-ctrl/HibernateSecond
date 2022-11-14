package relatioship;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BBBB")
public class B {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @OneToOne
    A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", a=" + a +
                '}';
    }
}
