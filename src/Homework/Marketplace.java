package Homework;

public class Marketplace {
    public static void main(String[] args) {
        Factory order = new Factory(100);
        Laptop[] stock = order.fillStock();
    }
}
