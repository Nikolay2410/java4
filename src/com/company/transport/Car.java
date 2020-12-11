package com.company.transport;

public class Car extends Transport {

    protected int vEngine;
    protected String type;

    public Car (String model,int passengers, int stopCount, String type, int vEngine) {
        super(model, passengers, stopCount);
        this.vEngine = vEngine;
        this.type = type;
    }
    @Override
    public void print() {
        System.out.println("Номер: " + getId());
        System.out.println("Автомобиль: " + getModel());
        System.out.println("Количество пассажиров: " + getPassengers());
        System.out.println("Количество остановок: " + getStopCount());
        System.out.println("Тип: " + this.type);
        System.out.println("Объём двигателя: " + this.vEngine);
        route();
    }

    @Override
    public void route() {
        System.out.println("Протяжённость маршрута: " + this.stopCount * 10 + " km" + "\n");
    }
}
