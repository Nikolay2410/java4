package com.company.transport;

public class Plane extends Transport {
    protected String engine;
    protected int wingspan;
    public Plane (String model, int passengers, int stopCount, String engine, int wingspan) {
        super(model, passengers, stopCount);
        this.engine = engine;
        this.wingspan = wingspan;
    }
    @Override
    public void print() {
        System.out.println("Номер: " + getId());
        System.out.println("Самолёт: " + getModel());
        System.out.println("Количество пассажиров: " + getPassengers());
        System.out.println("Количество остановок: " + getStopCount());
        System.out.println("Тип двигателя: " + this.engine);
        System.out.println("Размах крыльев: " + this.wingspan + " m");
        route();
    }

    @Override
    public void route() {
        System.out.println("Протяжённость маршрута: " + this.stopCount * 132 + " km" + "\n");
    }
}
