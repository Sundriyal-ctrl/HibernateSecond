package Cafe_Allocation_System.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int numberOfPeople;


    String name;
    boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "tables")
    List<TableBooking> tableBooking=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }



    public List<TableBooking> getTableBooking() {
        return tableBooking;
    }

    public void setTableBooking(List<TableBooking> tableBooking) {
        this.tableBooking = tableBooking;
    }
}
