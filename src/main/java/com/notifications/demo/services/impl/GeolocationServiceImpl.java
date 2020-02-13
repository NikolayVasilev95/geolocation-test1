package com.notifications.demo.services.impl;

import com.notifications.demo.domain.Geolocation;
import com.notifications.demo.repositories.GeolocationRepository;
import com.notifications.demo.services.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeolocationServiceImpl implements GeolocationService {

    @Autowired
    private GeolocationRepository geolocationRepository;

    @Override
    public Geolocation createGeolocation(Geolocation geolocation) {
        return geolocationRepository.save(geolocation);
    }
}
