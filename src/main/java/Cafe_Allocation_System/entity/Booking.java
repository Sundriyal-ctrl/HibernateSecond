package Cafe_Allocation_System.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    long number;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "booking1")
    List<Order> orderList=new ArrayList<>();
    @OneToMany(mappedBy = "booking")
    List<TableBooking> tableBooking=new ArrayList<>();
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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public List<TableBooking> getTableBooking() {
        return tableBooking;
    }

    public void setTableBooking(List<TableBooking> tableBooking) {
        this.tableBooking = tableBooking;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
