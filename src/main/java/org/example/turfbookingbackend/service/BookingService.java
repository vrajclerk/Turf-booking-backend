package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.model.Booking;

import java.util.List;


public interface BookingService {

    public List<Booking> findAll();
    public Booking createBooking(Booking booking);
    public List<Booking> findAllByUserId(int id);
    public List<Booking> findAllBybookingProviderId(int id);
    public Booking updateBooking(int id ,Booking booking);


}
