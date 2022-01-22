package com.example.solrwithjmetertest.dao;


import com.example.solrwithjmetertest.controller.FlightsSearchController;
import com.example.solrwithjmetertest.dao.rowmapper.FlightRowMapper;
import com.example.solrwithjmetertest.model.FlightModel;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FlightDao {

    @Resource(name = "myNamParamJdbcTemp")
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Resource
    private FlightRowMapper rowMapper;

    private static final String FLIGHT_ID = "flightId";

    public FlightModel getFlightById(Integer id) {

        Map<String, Object> paramMap = new HashMap();
        paramMap.put(FLIGHT_ID, id);

        return jdbcTemplate.queryForObject(getFindFlightByUidQuery(), paramMap, rowMapper);
    }

    private String getFindFlightByUidQuery() {
        return "select * from bookings.flights where flight_id = :" + FLIGHT_ID;
    }
}
