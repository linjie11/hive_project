package com.linjie.hive_project.mapper;

import com.linjie.hive_project.entity.Flight;
import com.linjie.hive_project.entity.Phase;

import java.util.List;

public interface UserMapper {
    List<Flight> getAllFlight();
    List<Phase> getPhase();
    List<Phase> getPhase(String faultName,String flightPhase);
}