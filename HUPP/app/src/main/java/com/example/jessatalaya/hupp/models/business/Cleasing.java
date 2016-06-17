package com.example.jessatalaya.hupp.models.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class Cleasing
{
    private int id;
    private List<CleasingTask> task = new ArrayList<CleasingTask>();
    private Room room;
    private Date beginning;
    private Date finish;
    private Date done;
    private Tenant tenant;
    private int rating;

    public Cleasing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CleasingTask> getTask() {
        return task;
    }

    public void setTask(List<CleasingTask> task) {
        this.task = task;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getBeginning() {
        return beginning;
    }

    public void setBeginning(Date beginning) {
        this.beginning = beginning;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Date getDone() {
        return done;
    }

    public void setDone(Date done) {
        this.done = done;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Cleasing{" +
                "id=" + id +
                ", task=" + task +
                ", room=" + room +
                ", beginning=" + beginning +
                ", finish=" + finish +
                ", done=" + done +
                ", tenant=" + tenant +
                ", rating=" + rating +
                '}';
    }
}
