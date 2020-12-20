package com.calender.CalenderServer.service;

import com.calender.CalenderServer.model.Event;
import com.calender.CalenderServer.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository repository;

    public List<Event> getEvents() {
        return repository.findAll();
    }

    public Event getEventById(int id) {
        return repository.findById(id).orElse(null);
    }


    public Event saveEvent(Event event) {
        return repository.save(event);
    }

    public List<Event> saveEvents(List<Event> event) {
        return repository.saveAll(event);
    }

    public String deleteEvent(int id) {
        repository.deleteById(id);
        return "removed event: " +id;
    }

    public Event updateEvent(Event event){
        Event existingEvent = repository.findById(event.getEvent_id()).orElse(null);
        assert existingEvent != null;
        existingEvent.setEvent_Name(event.getEvent_Name());
        existingEvent.setEvent_Category(event.getEvent_Category());
        existingEvent.setEvent_Time(event.getEvent_Time());
        existingEvent.set_calender_id(event.get_calender_id());
        return repository.save(existingEvent);
    }
}
