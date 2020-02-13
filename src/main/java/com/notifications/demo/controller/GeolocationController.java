package com.notifications.demo.controller;

import com.notifications.demo.domain.Geolocation;
import com.notifications.demo.services.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeolocationController {

    @Autowired
    private GeolocationService geolocationService;

    @PostMapping(value = "api/geolocation")
    ResponseEntity<Geolocation> geolocation(@RequestBody Geolocation geolocation) {
        geolocationService.createGeolocation(geolocation);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
