package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    @ManyToOne
    @JoinColumn(name = "facility_id")
    private Facility facility;

    // Constructors
    public Booking() {}
    public Booking(String customerName, Facility facility) {
        this.customerName = customerName;
        this.facility = facility;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public Facility getFacility() { return facility; }
    public void setFacility(Facility facility) { this.facility = facility; }
}
