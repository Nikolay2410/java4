package com.company.transport;

public class Train extends Transport {

    protected int carriageCount;
    protected String type;

    public Train (String model, int passengers, int stopCount, int carriageCount, String type) {
        super(model, passengers, stopCount);
        this.carriageCount = carriageCount;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("Номер: " + getId());
        System.out.println("Поезд: " + getModel());
        System.out.println("Количество пассажиров: " + getPassengers());
        System.out.println("Количество остановок: " + getStopCount());
        System.out.println("Количество вагонов: " + this.carriageCount);
        System.out.println("Тип: " + this.type);
        route();
    }

    @Override
    public void route() {
        System.out.println("Протяжённость маршрута: " + this.stopCount * 30 + " km" + "\n");
    }
}
