package com.example.demo.service;

import com.example.demo.model.Facility;
import java.util.List;

public interface FacilityService {
    List<Facility> getAllFacilities();
    Facility getFacilityById(Long id);
    Facility saveFacility(Facility facility);
}
