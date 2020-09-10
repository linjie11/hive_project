package com.linjie.hive_project.mapper;

import com.linjie.hive_project.entity.Flight;
import com.linjie.hive_project.entity.Phase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapperImp implements UserMapper{
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Flight> getAllFlight() {
        List data = jdbcTemplate.queryForList("SELECT * FROM abnormal_meta_flight_20200908");
        List<Flight> list = jdbcTemplate.query("SELECT * FROM abnormal_meta_flight_20200908",new BeanPropertyRowMapper<Flight>(Flight.class));
        return list;
    }


    @Override
    public List<Phase> getPhase() {
        List<Phase> list = jdbcTemplate.query("SELECT * FROM abnormal_flight_ori_20200908 WHERE flight_phase='B-603P_ZGYY_ZSSS_2020-08-11_01_24_50_2020-08-11_03_37_50_2.22' and field='HYD_SYS_PRS_1'",new BeanPropertyRowMapper<Phase>(Phase.class));
        return list;
    }

    @Override
    public List<Phase> getPhase(String faultName,String flightPhase) {
        List<Phase> list = jdbcTemplate.query("SELECT " + faultName+" FROM abnormal_flight_ori_20200908 WHERE flight_phase='"+flightPhase+"'",new BeanPropertyRowMapper<Phase>(Phase.class));
        return list;
    }

}
