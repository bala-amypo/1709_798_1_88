package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // ✅ CHANGE FROM LocalTime → String
    private String openTime;
    private String closeTime;

    public Facility() {}

    public String getOpenTime() {
        return openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }
}

