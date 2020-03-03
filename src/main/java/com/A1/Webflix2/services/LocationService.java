package com.A1.Webflix2.services;

import com.A1.Webflix2.repositories.LocationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.A1.Webflix2.models.Location;

@Service
public class LocationService {

    @Autowired
    private LocationRepository LocationRepository;

    public List<Location> list() {
        return LocationRepository.findAll();
    }
}