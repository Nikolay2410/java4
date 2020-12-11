package com.company.transport;

public abstract class Transport {
    protected int id;
    protected static int count = 1;
    protected String model;
    protected int passengers;
    protected int stopCount;

    public Transport(String model,int passengers, int stopCount) {
        this.id = count;
        count++;
        this.model = model;
        this.passengers = passengers;
        this.stopCount = stopCount;
    }

    public void print() {

    }

    public void route() {

    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getStopCount() {
        return stopCount;
    }
}