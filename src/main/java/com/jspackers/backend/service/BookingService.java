package com.jspackers.backend.service;

import com.jspackers.backend.model.Booking;
import com.jspackers.backend.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Create or Update Booking
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    // Get all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Get a booking by ID
    public Optional<Booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    // Delete a booking by ID
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
