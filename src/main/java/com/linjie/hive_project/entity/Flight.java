package com.linjie.hive_project.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Flight {
    private String acNumber;
    private String flight_phase;
    private String icao_departure_chn;
    private String icao_arrival_chn;
    private String departure_time;
    private String malfunction_info;
    private String malfunction_type;
    private int ata;
    private String p_date ;
    private String malfunction_lru;
    private String malfunction_aircraft_type;


    public String getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(String acNumber) {
        this.acNumber = acNumber;
    }

    public String getFlight_phase() {
        return flight_phase;
    }

    public void setFlight_phase(String flight_phase) {
        this.flight_phase = flight_phase;
    }

    public String getIcao_departure_chn() {
        return icao_departure_chn;
    }

    public void setIcao_departure_chn(String icao_departure_chn) {
        this.icao_departure_chn = icao_departure_chn;
    }

    public String getIcao_arrival_chn() {
        return icao_arrival_chn;
    }

    public void setIcao_arrival_chn(String icao_arrival_chn) {
        this.icao_arrival_chn = icao_arrival_chn;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getMalfunction_info() {
        return malfunction_info;
    }

    public void setMalfunction_info(String malfunction_info) {
        this.malfunction_info = malfunction_info;
    }

    public String getMalfunction_type() {
        return malfunction_type;
    }

    public void setMalfunction_type(String malfunction_type) {
        this.malfunction_type = malfunction_type;
    }

    public int getAta() {
        return ata;
    }

    public void setAta(int ata) {
        this.ata = ata;
    }

    public String getP_date() {
        return p_date;
    }

    public void setP_date(String p_date) {
        this.p_date = p_date;
    }

    public String getMalfunction_lru() {
        return malfunction_lru;
    }

    public void setMalfunction_lru(String malfunction_lru) {
        this.malfunction_lru = malfunction_lru;
    }

    public String getMalfunction_aircraft_type() {
        return malfunction_aircraft_type;
    }

    public void setMalfunction_aircraft_type(String malfunction_aircraft_type) {
        this.malfunction_aircraft_type = malfunction_aircraft_type;
    }
}
