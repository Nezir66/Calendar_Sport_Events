package com.calender.CalenderServer.model;


import javax.persistence.*;


@Entity
@Table(name = "Events")
public class Event {

    @Id
    private int event_id;
    @MapKey
    private int _calender_id;
    private String event_Name;
    private String event_Category;
    private String event_Time;


    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public int get_calender_id() {
        return _calender_id;
    }

    public void set_calender_id(int _calender_id) {
        this._calender_id = _calender_id;
    }

    public String getEvent_Name() {
        return event_Name;
    }

    public void setEvent_Name(String event_Name) {
        this.event_Name = event_Name;
    }

    public String getEvent_Category() {
        return event_Category;
    }

    public void setEvent_Category(String event_Category) {
        this.event_Category = event_Category;
    }

    public String getEvent_Time() {
        return event_Time;
    }

    public void setEvent_Time(String event_Time) {
        this.event_Time = event_Time;
    }

}
