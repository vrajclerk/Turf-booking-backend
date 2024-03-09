package org.example.turfbookingbackend.dao;

import org.example.turfbookingbackend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingDao extends JpaRepository<Booking,Integer> {

    List<Booking> findByUserId(int userId);

    List<Booking> findByDateAndGroundIdAndTimeSlotAndStatus(String date,int groundId, String timeSlot, String status);

    List<Booking> findByGroundId(int groundId);
}
