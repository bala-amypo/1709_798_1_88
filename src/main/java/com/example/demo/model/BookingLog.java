package com.example.demo.model;

import java.time.LocalDateTime;

public class BookingLog {

    private Long id;
    private Booking booking;
    private String logMessage;
    private LocalDateTime createdAt;

    public BookingLog() {}

    // REQUIRED by BookingLogServiceImpl
    public BookingLog(Long id, Booking booking, String logMessage, LocalDateTime createdAt) {
        this.id = id;
        this.booking = booking;
        this.logMessage = logMessage;
        this.createdAt = createdAt;
    }

    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public Booking getBooking() { return booking; }
    public void setBooking(Booking booking) { this.booking = booking; }

    public String getLogMessage() { return logMessage; }
    public void setLogMessage(String logMessage) { this.logMessage = logMessage; }

    public LocalDateTime getCreatedAt() { return createdAt; }
}
