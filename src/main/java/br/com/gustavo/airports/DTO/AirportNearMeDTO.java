/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavo.airports.DTO;

import br.com.gustavo.airports.projections.AirportNearMeProjection;

/**
 *
 * @author DIT2A
 */
public class AirportNearMeDTO {
    private long id;
    private String  name;
    private String city;
    private String iataCode;
    private double latitude;
    private double longitude;
    private double altitude;
    private double distanciaKM;

    public AirportNearMeDTO() {
        
    }

    public AirportNearMeDTO(AirportNearMeProjection airportNearMeProjection) {
        this.id = airportNearMeProjection.getId();
        this.name = airportNearMeProjection.getName();
        this.city = airportNearMeProjection.getCity();
        this.iataCode = airportNearMeProjection.getIataCode();
        this.latitude = airportNearMeProjection.getLatitude();
        this.longitude = airportNearMeProjection.getLongitude();
        this.altitude = airportNearMeProjection.getAltitude();
        this.distanciaKM = airportNearMeProjection.getDistanciaKM();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }
    
}
