package org.example.turfbookingbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;


@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String bookingId;

    private String timeSlot;

    private String date;

    private String status;


    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id", nullable = false)
    private Ground ground;

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private Admin admin;

    public Booking(){

    }

    public Booking(String bookingId, String timeSlot, String date, String status, User user, Ground ground,Admin admin) {
        this.bookingId = bookingId;
        this.timeSlot = timeSlot;
        this.date = date;
        this.status = status;
        this.user = user;
        this.ground = ground;
        this.admin=admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
