package com.calender.CalenderServer.controller;

import com.calender.CalenderServer.model.Calender;
import com.calender.CalenderServer.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CalenderRequest {
    @Autowired
    private CalendarService service;


    @PostMapping("/addCalender")
    public Calender getCalender(@RequestBody Calender calender){
        return service.saveCalendar(calender);
    }

    @GetMapping("/getCalenders")
    public List<Calender> getAllEvents(){
        return service.getCalenders();
    }

    @GetMapping("/getCalender/{id}")
    public Calender getCalenderById(@PathVariable int id) {
        return service.getCalendarById(id);
    }

}