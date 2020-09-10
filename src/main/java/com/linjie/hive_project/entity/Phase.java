package com.linjie.hive_project.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Phase {
    private String acNumber;
    private String departureTime;
    private String arrivalTime;
    private String icaoDeparture;
    private String icaoArrival;
    private String icaoDepartureChn;
    private String icaoArrivalChn;
    private String field;
    private String flightPhase;
    private List value;

    public List getValue() {
        return value;
    }

    public void setValue(List value) {
        this.value = value;
    }

    public String getFlightPhase() {
        return flightPhase;
    }

    public void setFlightPhase(String flightPhase) {
        this.flightPhase = flightPhase;
    }

    public String getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(String acNumber) {
        this.acNumber = acNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getIcaoDeparture() {
        return icaoDeparture;
    }

    public void setIcaoDeparture(String icaoDeparture) {
        this.icaoDeparture = icaoDeparture;
    }

    public String getIcaoArrival() {
        return icaoArrival;
    }

    public void setIcaoArrival(String icaoArrival) {
        this.icaoArrival = icaoArrival;
    }

    public String getIcaoDepartureChn() {
        return icaoDepartureChn;
    }

    public void setIcaoDepartureChn(String icaoDepartureChn) {
        this.icaoDepartureChn = icaoDepartureChn;
    }

    public String getIcaoArrivalChn() {
        return icaoArrivalChn;
    }

    public void setIcaoArrivalChn(String icaoArrivalChn) {
        this.icaoArrivalChn = icaoArrivalChn;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
