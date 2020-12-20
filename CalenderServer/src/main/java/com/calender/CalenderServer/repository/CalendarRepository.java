package com.calender.CalenderServer.repository;

import com.calender.CalenderServer.model.Calender;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CalendarRepository extends JpaRepository<Calender, Integer> {
}
