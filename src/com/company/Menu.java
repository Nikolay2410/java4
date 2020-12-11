package com.company;

import com.company.transport.Car;
import com.company.transport.Plane;
import com.company.transport.Train;

import java.util.Scanner;

public class Menu{
        private static Info info = new Info();
        private static Scanner in = new Scanner(System.in);
        static {
            info.add(new Car("Волга", 2, 7, "легковая", 250));
            info.add(new Train("Piko",260,23,18, "пригородный"));
            info.add(new Plane("Arbis A220",300,6,"газотурбинный", 55));
        }
    public static void menu () {

        int choice = -1;
        do{
            System.out.println("------------------------------");
            System.out.println("Главное Меню.");
            System.out.println("1. Просмотр списка.");
            System.out.println("2. Работа со списком.");
            System.out.println("0. Выход из программы.");
            System.out.println("------------------------------");

            while (!in.hasNextInt()) {
                System.out.println("Некорректный ввод. Пожалуйста введите 1, 2 или 0.");
                System.out.println("------------------------------");
                System.out.println("Главное Меню.");
                System.out.println("1. Просмотр списка.");
                System.out.println("2. Работа со списком.");
                System.out.println("0. Выход из программы.");
                System.out.println("------------------------------");
                in.next();
            }
            choice = Menu.read();
            switch (choice) {
                case 1:
                    info.print();
                    break;
                case 2:
                    secondMenu();
                    break;
                case 0:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста введите 1, 2 или 0.");
                    break;
            }
        }while(choice != 0);
    }

    public static void secondMenu () {
        int choice = -1;
        do{
            System.out.println("------------------------------");
            System.out.println("Работа со списком.");
            System.out.println("1. Просмотр списка.");
            System.out.println("2. Добавить транспорт в список.");
            System.out.println("3. Удалить транспорт из списка.");
            System.out.println("4. Поиск по номеру.");
            System.out.println("0. Назад.");
            System.out.println("------------------------------");

            while (!in.hasNextInt()) {
                System.out.println("Некорректный ввод. Пожалуйста введите 1, 2, 3, 4 или 0.");
                System.out.println("------------------------------");
                System.out.println("Работа со списком.");
                System.out.println("1. Просмотр списка.");
                System.out.println("2. Добавить транспорт в список.");
                System.out.println("3. Удалить транспорт из списка.");
                System.out.println("4. Поиск по номеру.");
                System.out.println("0. Назад.");
                System.out.println("------------------------------");
                in.next();
            }
            choice = Menu.read();
            switch (choice) {
                case 1:
                    info.print();
                    break;
                case 2:
                    addSecondMenu();
                    break;
                case 3:
                    deleteSecondMenu();
                    break;
                case 4:
                    System.out.println("Введите номер записи.");
                    int s = Menu.read();
                    info.search(s);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста введите 1, 2 или 0.");
                    break;
            }
        }while(choice != 0);
    }

    public static void addSecondMenu () {
        int choice = -1;
        do{
            System.out.println("------------------------------");
            System.out.println("Добавление транспорта.");
            System.out.println("1. Добавить автомобиль.");
            System.out.println("2. Добавить поезд.");
            System.out.println("3. Добавить самолёт.");
            System.out.println("0. Назад.");
            System.out.println("------------------------------");

            while (!in.hasNextInt()) {
                System.out.println("Некорректный ввод. Пожалуйста введите 1, 2, 3 или 0.");
                System.out.println("------------------------------");
                System.out.println("Добавление транспорта.");
                System.out.println("1. Добавить автомобиль.");
                System.out.println("2. Добавить поезд.");
                System.out.println("3. Добавить самолёт.");
                System.out.println("0. Назад.");
                System.out.println("------------------------------");
                in.next();
            }
            choice = Menu.read();
            switch (choice) {
                case 1:
                    System.out.println("Добавление автомобиля");
                    System.out.println("Марка автомобиля: ");
                    String model = in.nextLine();
                    System.out.println("Количество пассажиров: ");
                    int passengers = Menu.read();
                    System.out.println("Количество остановок: ");
                    int stopCount = Menu.read();
                    System.out.println("Тип автомобиля: ");
                    String type = in.nextLine();
                    System.out.println("Объём двигателя: ");
                    int vEngine = Menu.read();
                    info.add(new Car(model,passengers,stopCount,type,vEngine));
                    break;
                case 2:
                    System.out.println("Добавление поезда");
                    System.out.println("Модель поезда: ");
                    String model1 = in.nextLine();
                    System.out.println("Количество пассажиров: ");
                    int passengers1 = Menu.read();
                    System.out.println("Количество остановок: ");
                    int stopCount1 = Menu.read();
                    System.out.println("Количество вагонов: ");
                    int carriageCount1 = Menu.read();
                    System.out.println("Тип: ");
                    String type1 = in.nextLine();
                    info.add(new Train(model1,passengers1,stopCount1,carriageCount1,type1));
                    break;
                case 3:
                    System.out.println("Добавление самолёта");
                    System.out.println("Модель самолёта: ");
                    String model2 = in.nextLine();
                    System.out.println("Количество пассажиров: ");
                    int passengers2 = Menu.read();
                    System.out.println("Количество остановок: ");
                    int stopCount2 = Menu.read();
                    System.out.println("Тип двигателя: ");
                    String engine = in.nextLine();
                    System.out.println("Размах крыльев: ");
                    int wingspan2 = Menu.read();
                    info.add(new Plane(model2,passengers2,stopCount2,engine,wingspan2));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста введите 1, 2, 3 или 0.");
                    break;
            }
        }while(choice != 0);
    }

    public static void deleteSecondMenu () {
        int choice = -1;
        do{
            System.out.println("------------------------------");
            System.out.println("Удаление транспорта.");
            System.out.println("1. Просмотр списка.");
            System.out.println("2. Удаление.");
            System.out.println("0. Назад.");
            System.out.println("------------------------------");

            while (!in.hasNextInt()) {
                System.out.println("Некорректный ввод. Пожалуйста введите 1, 2 или 0.");
                System.out.println("------------------------------");
                System.out.println("Удаление транспорта.");
                System.out.println("1. Просмотр списка.");
                System.out.println("2. Удаление.");
                System.out.println("0. Назад.");
                System.out.println("------------------------------");
                in.next();
            }
            choice = Menu.read();
            switch (choice) {
                case 1:
                    info.print();
                    break;
                case 2:
                    System.out.println("Введите номер транспорта для его удаления.");
                    choice = Menu.read();
                    info.del(choice);
                    choice = 0;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста введите 1, 2 или 0.");
                    break;
            }
        }while(choice != 0);
    }

    private static int read() {
        int num = -1;
        try {
            num = Integer.parseInt(in.nextLine());
            if (num < 0) {
                System.out.println("Неверный ввод. Значение не может быть отрицательным. Введите значение ещё раз.");
                num = Menu.read();
            }
        }
        catch (NumberFormatException ex) {
            System.out.println("Некорректный ввод. Введите значение ещё раз.");
            num = Menu.read();
        }
        return num;
    }
}
