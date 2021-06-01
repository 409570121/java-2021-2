package com.kevin.car;

public class Car {
    private  String enterTime;
    private String id;
    public Car (String id){
        this.id = id;
    }
    public Car (String id, String enterTime){
        this.id = id;
        this.enterTime = enterTime;
    }
    public String getId() {
        return id;
    }

    public String getEnterTime() {
        return id;
    }
}

