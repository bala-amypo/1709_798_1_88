package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalTime openTime;
    private LocalTime closeTime;

    public Facility() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }
}
