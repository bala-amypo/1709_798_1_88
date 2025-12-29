package com.example.demo.model;

import java.time.LocalTime;

public class Facility {

    private Long id;
    private String name;
    private String type;
    private String location;
    private String description;
    private LocalTime openTime;
    private LocalTime closeTime;

    public Facility() {}

    public Facility(Long id, String name, String type,
                    String location, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.description = description;
    }

    public Long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalTime getOpenTime() { return openTime; }
    public void setOpenTime(LocalTime openTime) { this.openTime = openTime; }

    public LocalTime getCloseTime() { return closeTime; }
    public void setCloseTime(LocalTime closeTime) { this.closeTime = closeTime; }
}
