package com.linjie.hive_project.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.linjie.hive_project.entity.Data;
import com.linjie.hive_project.entity.Flight;
import com.linjie.hive_project.entity.Phase;
import com.linjie.hive_project.entity.Trends;
import com.linjie.hive_project.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private static final ObjectMapper MAPPER = new ObjectMapper();

//    public String query_fight_phase2(){
//
//        String sql = "select HYD_SYS_PRS_2 from qar_process_29_fault_20200909 where flight_phase='B-603P_ZGYY_ZSSS_2020-08-11_01_24_50_2020-08-11_03_37_50_2.22'";
//        List<Map<String, Object>> list1 = jdbcTemplate.queryForList(sql);
////        DATA mydata = new DATA("HYD_SYS_PRS_2","PRS","36");
//        Flightclass myFlight = new Flightclass("B3388","ZLIC",new DATA("HYD_SYS_PRS_2","PRS",list1));
//        try {
//            String string = MAPPER.writeValueAsString(myFlight);
//            return string;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }


    @Autowired
    UserMapper userMapper;
    public List<Flight> getAllFlight(){
        return userMapper.getAllFlight();
    }

    public List<Phase> getPhase(){
        return userMapper.getPhase();
    }

    public List<Phase> getPhase(String faultName,String flightPhase){
        return userMapper.getPhase(faultName,flightPhase);
    }

    public Map<String, Object> getMap(String faultName,String flightPhase) {
        Map<String, Object> map = new HashMap<>(3);

        Phase phase = userMapper.getPhase(faultName,flightPhase).get(0);
        Data data = new Data();
        data.setTitle(phase.getField());
        data.setType(phase.getField().substring(8,11));
        List allvalue = phase.getValue();
        List trends = new ArrayList();
        for (int i=0;i<allvalue.size();i+=2){
            String str1 = ((String) allvalue.get(i));
            String datetime = str1.substring(str1.indexOf("2"),str1.indexOf("\"",20));
            String str2 = (String) allvalue.get(i+1);
            String value = str2.substring(str2.indexOf(":")+2,str2.indexOf("}")-1);
            trends.add(new Trends(datetime,value));
        }
        data.setTrends(trends);
        map.put("AC_NUMBER", phase.getAcNumber());
        map.put("FLIGHT_PHASE", phase.getFlightPhase());
        map.put("ICAO_DEPARTURE",phase.getIcaoDeparture());
        map.put("ICAO_ARRIVAL",phase.getIcaoArrival());
        map.put("ICAO_DEPARTURE_CHN",phase.getIcaoDepartureChn());
        map.put("ICAO_ARRIVAL_CHN",phase.getIcaoArrivalChn());
        map.put("DEPARTURE_TIME", phase.getDepartureTime());
        map.put("DATA",data);
        return map;
    }
}
