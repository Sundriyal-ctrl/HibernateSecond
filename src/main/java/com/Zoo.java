package com;


import javafx.beans.DefaultProperty;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.DynamicUpdate;
import relatioship.student_s_m;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
//
//@Entity
//@Cacheable
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@DynamicUpdate
@Entity
public class Zoo {
    @Id
   int id;
   String name;

   @OneToOne()
   @JoinColumn(name = "mid")
  student_s_m student_s_m;

    public relatioship.student_s_m getStudent_s_m() {
        return student_s_m;
    }

    public void setStudent_s_m(relatioship.student_s_m student_s_m) {
        this.student_s_m = student_s_m;
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
        return "Zoo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

