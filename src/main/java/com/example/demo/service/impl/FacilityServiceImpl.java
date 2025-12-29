package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Facility;
import com.example.demo.repository.FacilityRepository;
import com.example.demo.service.FacilityService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FacilityServiceImpl implements FacilityService {

    private final FacilityRepository facilityRepository;

    public FacilityServiceImpl(FacilityRepository facilityRepository) {
        this.facilityRepository = facilityRepository;
    }

    @Override
    public Facility createFacility(Facility facility) {
        return facilityRepository.save(facility);
    }

    @Override
    public Facility getFacilityById(Long id) {
        return facilityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Facility not found with id: " + id));
    }

    @Override
    public List<Facility> getAllFacilities() {
        return facilityRepository.findAll();
    }

    @Override
    public Facility updateFacility(Long id, Facility facility) {
        Facility existing = getFacilityById(id);
        existing.setName(facility.getName());
        existing.setDescription(facility.getDescription());
        return facilityRepository.save(existing);
    }

    @Override
    public void deleteFacility(Long id) {
        Facility existing = getFacilityById(id);
        facilityRepository.delete(existing);
    }
}
