package com.company;

import com.company.transport.Transport;

import java.util.ArrayList;

public class Info {
    protected ArrayList<Transport> info = new ArrayList();
    public void print() {
        for (Transport transport: info) {
            transport.print();
        }
    }
    public void add(Transport transport) {
        info.add(transport);
        System.out.println("Транспорт добавлен в список.");
    }

    public void del(int c) {
        boolean b = false;
        for (Transport transport : info) {
            if (c == transport.getId()){
                b = true;
            }
        }
        if (b == false){
            System.out.println("Запись не найдена.");
        }else {
            info.removeIf(transport -> transport.getId() == c);
            System.out.println("Удаление прошло успешно.");
        }
    }

    public void search (int s) {
        boolean b = false;
        for (Transport transport : info) {
            if (s == transport.getId()){
                b = true;
                transport.print();
            }
        }
        if (b == false){
            System.out.println("Запись не найдена.");
        }
    }
}
