package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BookingLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Booking booking;

    private String action;
    private LocalDateTime loggedAt;

    public BookingLog() {}

    public BookingLog(Long id, Booking booking, String action, LocalDateTime loggedAt) {
        this.id = id;
        this.booking = booking;
        this.action = action;
        this.loggedAt = loggedAt;
    }

    public Long getId() {
        return id;
    }

    public Booking getBooking() {
        return booking;
    }

    public String getAction() {
        return action;
    }

    public LocalDateTime getLoggedAt() {
        return loggedAt;
    }
}
