package Homework;

import java.util.*;

public class Marketplace {
    public static void main(String[] args) {
        Factory order = new Factory(10);
        Laptop[] set = order.fillStock();
//        printArr(set);
        ArrayList<Laptop> stock = arrToList(set);


        int choice = -1;
         do{
            System.out.println("\nг==============  МЕНЮ  =============|");
            System.out.println("|\t1. Найти ноутбук по критериям   |");
            System.out.println("|\t0. Выйти                        |");
            choice = put("| Выберите пункт из меню:           |");
            switch (choice){
                case 1:
                    ArrayList<Laptop> res = menu(stock);
                    System.out.println("Вероятно, это то, что Вы искали:\n");
                    printList(res);
                case 0:
                    break;
            }
        }while (choice != 0);
    }

    public static ArrayList<Laptop> arrToList (Laptop[] set){
        ArrayList<Laptop> stock = new ArrayList<>();
        for (Laptop item:
                set) {
            stock.add(item);
        }
        return stock;
    }

    public static ArrayList<Laptop> menu(ArrayList<Laptop> stock){
        StringBuilder head = new StringBuilder();
        head.append("Для поиска лучшей модели воспользуйтесь фильтрами:");
        head.append("" +
                "\n|        v     v     v     v        |" +
                "\n| 1.\tпо модели                   |" +
                "\n| 2.\tпо оперативной памяти       |" +
                "\n| 3.\tпо объему жесткого диска    |" +
                "\n| 4.\tпо предустановленной ОС     |" +
                "\n| 5.\tпо цвету                    |" +
                "\n|___________________________________|" +
                "\nТак же Вы можете попробовать подобрать идеальный вариант " +
                "\nна нашем большом складе " +
                "\n_____________________________________" +
                "\n| 6.\tподобрать идеальный вариант |" +
                "\n|___________________________________|");
        head.append("\n0.\tПоказать всё, что есть");
        System.out.println(head);
        int choise = put("Выберите фильтр:");
        while (choise!=0) {
            switch (choise) {
                case 1:
                    return filterByModel(stock);
                case 2:
                    return filterByRam(stock);
                case 3:
                    return filterByMem(stock);
                case 4:
                    return filterByOs(stock);
                case 5:
                    return filterByColor(stock);
                case 6:
                    return makeIdeal(256);
                case 0:
                    break;
                default:
                    System.out.println("Неопознанная команда");
            }
        }
        return stock;
    }

    public static ArrayList<Laptop> filterByModel(ArrayList<Laptop> set) {
        StringBuilder head = new StringBuilder();
        head.append("Всего доступны 7 моделей:");
        head.append("\n1.\tAcuc \n2.\tLevono \n3.\tIntesit \n4.\tSansumg \n5.\tPresstiger \n6.\tAker \n7.\tMotonola");
        head.append("\n0.\tНе имеет значения");
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
                return (set);
            default:
                System.out.println("Некорректный ввод");
                filterByModel(set);
                break;
        }
        ArrayList<Laptop> res = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if ((set.get(i).getModel()).equals(model)){
                res.add(set.get(i));
            }
        }
        return res;
    }

    public static ArrayList<Laptop> filterByOs(ArrayList<Laptop> set) {
        StringBuilder head = new StringBuilder();
        head.append("Всего доступны 5 операционных систем:");
        head.append("\n1.\tLinux \n2.\tMS Dos \n3.\tWindows \n4.\tAndroid \n5.\tFreeBSD");
        head.append("\n0.\tНе имеет значения");
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
                return (set);
            default:
                System.out.println("Некорректный ввод");
                filterByOs(set);
                break;
        }
        ArrayList<Laptop> res = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if ((set.get(i).getOs()).equals(os)){
                res.add(set.get(i));
            }
        }
        return res;
    }

    public static ArrayList<Laptop> filterByColor(ArrayList<Laptop> set) {
        StringBuilder head = new StringBuilder();
        head.append("Всего доступны 3 цвета:");
        head.append("\n1.\tЧерный \n2.\tСерый \n3.\tБелый");
        head.append("\n0.\tНе имеет значения");
        System.out.println(head);
        int choise = put("Выберите номер цвета:");
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
                return (set);
            default:
                System.out.println("Некорректный ввод");
                filterByColor(set);
                break;
        }
        ArrayList<Laptop> res = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if ((set.get(i).getColor()).equals(color)){
                res.add(set.get(i));
            }
        }
        return res;
    }

    public static ArrayList<Laptop> filterByRam(ArrayList<Laptop> set){
        int minRam = put("Введите минимальное значение оперативной памяти (от 2 Гб)");
        int maxRam = put("Введите максимальное значение оперативной памяти (до 256 Гб)");
        ArrayList<Laptop> res = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if ((set.get(i).getRam()>=minRam) && (set.get(i).getRam()<=maxRam)){
                res.add(set.get(i));
            }
        }
        return res;
    }

    public static ArrayList<Laptop> filterByMem (ArrayList<Laptop> set){
        int minMem = put("Введите минимальный объем жесткого диска (от 64 Гб)");
        int maxMem = put("Введите максимальный объем жесткого диска (до 4096 Гб)");
        ArrayList<Laptop> res = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if ((set.get(i).getMemory()>=minMem) && (set.get(i).getMemory()<=maxMem)){
                res.add(set.get(i));
            }
        }
        return res;
    }

    public static ArrayList<Laptop> makeIdeal (int order){
        System.out.printf("Выбираем из %d моделей\n", order);
        Factory factory = new Factory(order);
        Laptop[] stock = factory.fillStock();
        ArrayList<Laptop> set = arrToList(stock);

        System.out.println("Сейчас подберём идеальный вариант для Вас");
        System.out.println("Для начала определимся с объемом ПЗУ");
        ArrayList<Laptop> step1 = filterByMem(set);
        ifNot(step1,order);
        System.out.println("Теперь задайте объем ОЗУ");
        ArrayList<Laptop> step2 = filterByRam(step1);
        ifNot(step2,order);
        System.out.println("Какому производителю Вы больше доверяете?");
        ArrayList<Laptop> step3 = filterByModel(step2);
        ifNot(step3,order);
        System.out.println("Какую операционную систему Вам поставить?");
        ArrayList<Laptop> step4 = filterByOs(step3);
        ifNot(step4,order);
        System.out.println("В какой цвет покрасим корпус?");
        ArrayList<Laptop> res = filterByColor(step4);
        ifNot(res,order);

        System.out.println("Мы нашли то, что Вы искали!");
        return (res);
    }

    public static void ifNot(ArrayList<Laptop> list, int order){
        if (list.size()<1) {
            System.out.println("Приносим свои извинения, но нам придется довезти ещё устройств с завода, а Вам - повторить выбор");
            makeIdeal(order*2);
        }
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
