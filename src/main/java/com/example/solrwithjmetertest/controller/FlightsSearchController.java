package com.example.solrwithjmetertest.controller;

import com.example.solrwithjmetertest.model.FlightModel;
import com.example.solrwithjmetertest.service.FlightService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping(value = "/flight")
public class FlightsSearchController {

    private final Logger LOG = LogManager.getLogger(FlightsSearchController.class);

    @Resource
    private FlightService flightService;

    @GetMapping("/get-by-uid/{id}")
    @ResponseBody
    public FlightModel getFlightById(@PathVariable Integer id) {
        return flightService.getFlightById(id);
    }

    private static class IntRowMapper implements RowMapper<Integer> {
        @Override
        public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
            return rs.getInt(1);
        }
    }
}
