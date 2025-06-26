package com.jspackers.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private String contactNumber;
    private String movingDate;

    // Constructors
    public Booking() {}

    public Booking(String customerName, String pickupLocation, String dropLocation, String contactNumber, String movingDate) {
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.contactNumber = contactNumber;
        this.movingDate = movingDate;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getMovingDate() {
        return movingDate;
    }

    public void setMovingDate(String movingDate) {
        this.movingDate = movingDate;
    }
}
