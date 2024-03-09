package model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    private int id;

    private String bookingId;

    private String timeSlot;

    private String date;

    private String status;

    @ManyToOne(cascade=CascadeType.All)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    private Ground ground;
}
