package com.example.solrwithjmetertest.dao.rowmapper;

import com.example.solrwithjmetertest.model.FlightModel;
import com.example.solrwithjmetertest.model.FlightStatus;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class FlightRowMapper implements RowMapper<FlightModel> {

    private static final String UID = "flight_id";
    private static final String FLIGHT_NUM = "flight_no";
    private static final String SCH_DEPARTURE = "scheduled_departure";
    private static final String SCH_ARRIVAL = "scheduled_arrival";
    private static final String DEPARTURE_AIRPORT = "departure_airport";
    private static final String ARRIVAL_ARIPORT = "arrival_airport";
    private static final String STATUS = "status";
    private static final String AIRCRAFT_CODE = "aircraft_code";
    private static final String ACT_DEPARTURE = "actual_departure";
    private static final String ACT_ARRIVAL = "actual_arrival";

    @Override
    public FlightModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        FlightModel flightModel = new FlightModel();
        flightModel.setUid(rs.getInt(UID));
        flightModel.setFlightNum(rs.getString(FLIGHT_NUM));
        flightModel.setSchDeparture(rs.getDate(SCH_DEPARTURE));
        flightModel.setSchArrival(rs.getDate(SCH_ARRIVAL));
        flightModel.setSchArrival(rs.getDate(SCH_ARRIVAL));
        flightModel.setDepartureAirport(rs.getString(DEPARTURE_AIRPORT));
        flightModel.setArrivalAirport(rs.getString(ARRIVAL_ARIPORT));
        flightModel.setStatus(FlightStatus.getValueForString(rs.getString(STATUS)));
        flightModel.setAircraftCode(rs.getString(AIRCRAFT_CODE));
        flightModel.setActDeparture(rs.getDate(ACT_DEPARTURE));
        flightModel.setActArrival(rs.getDate(ACT_ARRIVAL));
        return flightModel;
    }
}
