package Cafe_Allocation_System.entity;

import javax.persistence.*;

@Entity
@Table(name="Ordertable")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String ordername;
    @ManyToOne
    Booking booking1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public Booking getBooking1() {
        return booking1;
    }

    public void setBooking1(Booking booking1) {
        this.booking1 = booking1;
    }
}
