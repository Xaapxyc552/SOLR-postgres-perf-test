package com.example.solrwithjmetertest.model;

import java.util.EnumSet;

public enum FlightStatus {
    DEPARTED("Departed"),
    ARRIVED("Arrived"),
    ON_TIME("On Time"),
    CANCELLED("Cancelled"),
    DELAYED("Delayed"),
    SCHEDULED("Scheduled");

    private String code;


    FlightStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static FlightStatus getValueForString(String status) {
        return EnumSet.allOf(FlightStatus.class).stream()
                .filter(enVal -> enVal.getCode().equals(status))
                .findFirst()
                .orElseThrow(() -> {
                    throw new RuntimeException("Not found FlightStatus for status: " + status);
                });
    }

}
