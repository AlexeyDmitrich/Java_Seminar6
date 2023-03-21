package Homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Marketplace {
    public static void main(String[] args) {
        Factory order = new Factory(10);
        Laptop[] stock = order.fillStock();
        printArr(stock);
        ArrayList<Laptop> res = filterByModel(stock);
        printList(res);
    }

    public static void menu(Laptop[] stock){
        int choise = put("Выберите фильтр:");
        switch (choise){
            case 1:
                filterByModel(stock);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                filterByOs(stock);
                break;
            case 5:
                filterByColor(stock);
                break;
            case 6:
                break;
        }
    }

    public static ArrayList<Laptop> filterByModel(Laptop[] set) {
        StringBuilder head = new StringBuilder();
        head.append("Всего доступны 7 моделей:");
        head.append("\n1.\tAcuc \n2.\tLevono \n3.\tIntesit \n4.\tSansumg \n5.\tPresstiger \n6.\tAker \n7.\tMotonola");
        head.append("\n0.\tВернуться в меню");
        System.out.println(head);
        int choise = put("Выберите номер модели:");
        String model = null;
        switch (choise) {
            case 1:
                model = "Levono";
                break;
            case 2:
                model = "Acuc";
                break;
            case 3:
                model = "Intesit";
                break;
            case 4:
                model = "Sansumg";
                break;
            case 5:
                model = "Presstiger";
                break;
            case 6:
                model = "Aker";
                break;
            case 7:
                model = "Motonola";
                break;
            case 0:
                menu(set);
                break;
            default:
                System.out.println("Некорректный ввод");
                filterByModel(set);
                break;
        }
        ArrayList<Laptop> res = new ArrayList<>();
        for (int i = 0; i < set.length; i++) {
            if ((set[i].getModel()).equals(model)){
                res.add(set[i]);
            }
        }
        return res;
    }

    public static ArrayList<Laptop> filterByOs(Laptop[] set) {
        StringBuilder head = new StringBuilder();
        head.append("Всего доступны 5 операционных систем:");
        head.append("\n1.\tLinux \n2.\tMS Dos \n3.\tWindows \n4.\tAndroid \n5.\tFreeBSD");
        head.append("\n0.\tВернуться в меню");
        System.out.println(head);
        int choise = put("Выберите номер ОС:");
        String os = null;
        switch (choise) {
            case 1:
                os = "Linux";
                break;
            case 2:
                os = "MS Dos";
                break;
            case 3:
                os = "Windows 10";
                break;
            case 4:
                os = "Android";
                break;
            case 5:
                os = "FreeBSD";
                break;
            case 0:
                menu(set);
                break;
            default:
                System.out.println("Некорректный ввод");
                filterByOs(set);
                break;
        }
        ArrayList<Laptop> res = new ArrayList<>();
        for (int i = 0; i < set.length; i++) {
            if ((set[i].getOs()).equals(os)){
                res.add(set[i]);
            }
        }
        return res;
    }

    public static ArrayList<Laptop> filterByColor(Laptop[] set) {
        StringBuilder head = new StringBuilder();
        head.append("Всего доступны 3 цвета:");
        head.append("\n1.\tЧерный \n2.\tСерый \n3.\tБелый");
        head.append("\n0.\tВернуться в меню");
        System.out.println(head);
        int choise = put("Выберите номер ОС:");
        String color = null;
        switch (choise) {
            case 1:
                color = "Черный";
                break;
            case 2:
                color = "Серый";
                break;
            case 3:
                color = "Белый";
                break;
            case 0:
                menu(set);
                break;
            default:
                System.out.println("Некорректный ввод");
                filterByColor(set);
                break;
        }
        ArrayList<Laptop> res = new ArrayList<>();
        for (int i = 0; i < set.length; i++) {
            if ((set[i].getColor()).equals(color)){
                res.add(set[i]);
            }
        }
        return res;
    }

    static Scanner input = new Scanner(System.in);
    public static int put(String usersText){
        try {
            System.out.println(usersText);
            int value = input.nextInt();
            return value;
        } catch (InputMismatchException e){
            System.out.println("Слишком длинное число...");
            return 0;
        }
    }

    public static void printArr (Laptop[] stock){
        for (int i = 0; i < stock.length; i++) {
            System.out.println(stock[i]);
        }
    }
    public static void printList (List list){
        for (Object item:
             list) {
            System.out.println(item);
        }
    }
}
