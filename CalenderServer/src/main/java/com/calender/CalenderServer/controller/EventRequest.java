package com.calender.CalenderServer.controller;

import com.calender.CalenderServer.service.EventService;
import com.calender.CalenderServer.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EventRequest {
    @Autowired
    private EventService service;


    @PostMapping("/addEvent")
    public Event getEvent(@RequestBody Event event){
        return service.saveEvent(event);
    }

    @GetMapping("/getEvents")
    public List<Event> getAllEvents(){
        return service.getEvents();
    }

    @GetMapping("/getEvent/{id}")
    public Event getEventById(@PathVariable int id) {
        return service.getEventById(id);
    }

}
