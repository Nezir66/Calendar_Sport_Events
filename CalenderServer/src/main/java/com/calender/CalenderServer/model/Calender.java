package com.calender.CalenderServer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.Table;

@Entity
@Table(name = "calender")
public class Calender {
    @Id
    private int calender_id;
    @MapKey
    private int _user_id;
    private String calender_name;

    public int get_user_id() {
        return _user_id;
    }

    public void set_user_id(int _user_id) {
        this._user_id = _user_id;
    }

    public long getCalender_id() {
        return calender_id;
    }

    public void setCalender_id(int calender_id) {
        this.calender_id = calender_id;
    }

    public String getCalender_name() {
        return calender_name;
    }

    public void setCalender_name(String calender_name) {
        this.calender_name = calender_name;
    }

}
