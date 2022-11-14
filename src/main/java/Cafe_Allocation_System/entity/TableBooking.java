package Cafe_Allocation_System.entity;

import javax.persistence.*;

@Entity
public class TableBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int totalPerson;
    @ManyToOne
    Booking booking;
    @ManyToOne
    Tables tables;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalPerson() {
        return totalPerson;
    }

    public void setTotalPerson(int totalPerson) {
        this.totalPerson = totalPerson;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Tables getTables() {
        return tables;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }
}
