package com.calender.CalenderServer.service;

import com.calender.CalenderServer.model.Calender;
import com.calender.CalenderServer.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {
    @Autowired
    private CalendarRepository repository;

    public List<Calender> getCalenders() {
        return repository.findAll();
    }

    public Calender getCalendarById(int id) {
        return repository.findById(id).orElse(null);
    }


    public Calender saveCalendar(Calender event) {
        return repository.save(event);
    }

    public List<Calender> saveCalendars(List<Calender> event) {
        return repository.saveAll(event);
    }

    public String deleteCalendar(int id) {
        repository.deleteById(id);
        return "removed event: " +id;
    }
}
