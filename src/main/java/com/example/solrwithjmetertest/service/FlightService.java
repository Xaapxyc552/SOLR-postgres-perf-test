package com.example.solrwithjmetertest.service;

import com.example.solrwithjmetertest.dao.FlightDao;
import com.example.solrwithjmetertest.dao.NamedParamJdbcTemplate;
import com.example.solrwithjmetertest.model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    private FlightDao flightDao;

    public FlightModel getFlightById(Integer id) {
        return flightDao.getFlightById(id);
    }
}
