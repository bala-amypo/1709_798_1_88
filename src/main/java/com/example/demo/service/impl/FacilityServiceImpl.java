package com.example.demo.service.impl;

import com.example.demo.exception.BadRequestException;
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

        if (facility.getOpenTime() == null) {
            throw new BadRequestException("Open time is required");
        }

        if (facility.getCloseTime() == null) {
            throw new BadRequestException("Close time is required");
        }

        return facilityRepository.save(facility);
    }

    @Override
    public List<Facility> get
