package com.linjie.hive_project.controller;

import com.linjie.hive_project.service.UserService;
import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public List findFlightphase(){
        return userService.getAllFlight();
    }

    @RequestMapping("/get1")
    public List findphase(){
        return userService.getPhase();
    }

    @GetMapping("/get2")
    public List findphase(String faultName,String flightPhase){
        return userService.getPhase(faultName,flightPhase);
    }

    @GetMapping("/get3")
    public Map getjson(){
        return userService.getMap();
    }

}