package com.example.demo.model;

import java.time.LocalDateTime;

public class BookingLog {

    private Long id;
    private String logMessage;
    private LocalDateTime createdAt;

    public BookingLog() {}

    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getLogMessage() { return logMessage; }
    public void setLogMessage(String logMessage) { this.logMessage = logMessage; }

    public LocalDateTime getCreatedAt() { return createdAt; }
}
