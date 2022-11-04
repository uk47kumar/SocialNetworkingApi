package com.example.demo.locations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location getLocation(String id) {
        Optional<Location> result = locationRepository.findById(id);
        return result.get();
    }

    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }

    public void updateLocation(String id, Location location) {
        locationRepository.save(location);
    }

    public void deleteLocation(String id) {
        locationRepository.deleteById(id);
    }

}
