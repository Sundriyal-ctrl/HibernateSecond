package relatioship;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.hibernate.action.internal.OrphanRemovalAction;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.id.UUIDGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="Sun")
@NamedQueries({
        @NamedQuery(name = "findAll", query = "From A"),
        @NamedQuery(name = "findOne", query = "From A where id=:id")
})
public class A {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String name;



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
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
