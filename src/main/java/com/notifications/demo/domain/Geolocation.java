package com.notifications.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Geolocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "geolocation_id_generator")
    @SequenceGenerator(
            name = "geolocation_id_generator",
            sequenceName = "geolocation_id_seq",
            allocationSize = 1)
    private Long id;

    @NotBlank
    @Size(max = 255)
    private String latitude;

    @NotBlank
    @Size(max = 255)
    private String longitude;

    public Geolocation() {
    }

    public Geolocation(Long id, @NotBlank @Size(max = 255) String latitude, @NotBlank @Size(max = 255) String longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
