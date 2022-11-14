package com;



import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.event.spi.SaveOrUpdateEvent;

import javax.persistence.*;
import java.io.Serializable;


@Entity()
//@NamedQuery(name = "getMarks",query ="FROM m where id=:id")

public class Mark implements Serializable {
    @Id
    int id;

    //@Column(unique = true)
    private int marks;

    private int p;


    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", marks=" + marks +
                ", p=" + p +
                '}';
    }
}
