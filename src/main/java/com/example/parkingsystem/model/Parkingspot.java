package com.example.parkingsystem.model;

import java.util.UUID;

public class Parkingspot {
    private final UUID id;
    private  String p_num;
    private  String date;
    private String time;
    private String p_status;


    public UUID getId() {
        return id;
    }

    public String getP_num() {
        return p_num;
    }

    public void setP_num(String p_num) {
        this.p_num = p_num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getP_status() {
        return p_status;
    }

    public void setP_status(String p_status) {
        this.p_status = p_status;
    }

    public Parkingspot(UUID id, String p_num, String date, String time, String p_status) {
        this.id = id;
        this.p_num = p_num;
        this.date = date;
        this.time = time;
        this.p_status = p_status;
    }


}
