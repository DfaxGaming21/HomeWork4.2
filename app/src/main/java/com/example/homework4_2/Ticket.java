package com.example.homework4_2;

import java.io.Serializable;

public class Ticket implements Serializable {

    private String Id;
    private String arrivalDeparture;
    private String time;
    private String cost;

    public Ticket(String Id, String arrivalDeparture, String time, String cost) {
        this.Id = Id;
        this.arrivalDeparture = arrivalDeparture;
        this.time = time;
        this.cost = cost;
    }


    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getArrivalDeparture() {
        return arrivalDeparture;
    }

    public void setArrivalDeparture(String arrivalDeparture) {
        this.arrivalDeparture = arrivalDeparture;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
