package com.example.solrwithjmetertest.model;

import java.io.Serializable;
import java.util.Date;

public class FlightModel implements Serializable {

    private Integer uid;
    private String flightNum;
    private Date schDeparture;
    private Date schArrival;
    private String departureAirport;
    private String arrivalAirport;
    private FlightStatus status;
    private String aircraftCode;
    private Date actDeparture;
    private Date actArrival;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Date getSchDeparture() {
        return schDeparture;
    }

    public void setSchDeparture(Date schDeparture) {
        this.schDeparture = schDeparture;
    }

    public Date getSchArrival() {
        return schArrival;
    }

    public void setSchArrival(Date schArrival) {
        this.schArrival = schArrival;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public Date getActDeparture() {
        return actDeparture;
    }

    public void setActDeparture(Date actDeparture) {
        this.actDeparture = actDeparture;
    }

    public Date getActArrival() {
        return actArrival;
    }

    public void setActArrival(Date actArrival) {
        this.actArrival = actArrival;
    }
}
