package com.example.samsung.anydo.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by samsung on 29/06/2015.
 */
public class Task {
    private String taskTitle;
    private String name;
    private Date time;
    private List<String> subtaskList=new ArrayList<>();
    private Date createTime;

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
    public void setSubtaskList(List list){
        subtaskList.addAll(list);
    }
    public List getSubtaskList(){
        return this.subtaskList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }
}
