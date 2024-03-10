package org.example.turfbookingbackend.Repository;

import org.example.turfbookingbackend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

    @Query("select booking from Booking booking where booking.user.id = :id")
    List<Booking> findAllByUserId(int  id);
//    @Query("select booking from Booking booking where booking.booking.id = :id")
//    List<Booking> findAllByServiceProviderId(int  id);

    @Query("select booking from Booking booking where booking.booking.id = :id")
    Booking findById(int  id);
}
