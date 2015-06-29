package com.example.samsung.anydo.Model;

import java.util.Date;
import java.util.List;

/**
 * Created by samsung on 29/06/2015.
 */
public class Task {
    private String name;
    private Date time;
    private List<String> list
    public Task(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String str){
        this.name=name;
    }
    public Date getTime(){
        return time;
    }
    public void setTime(Date time){
        this.time=time;
    }

}
