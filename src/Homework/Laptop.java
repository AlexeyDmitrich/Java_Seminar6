package Homework;

public class Laptop {
    private String model;
    private String modelName;
    private int ram;
    private int memory;
    private String os;
    private String color;

    public Laptop(String model, String modelName, int ram, int memory, String os, String color) {
        this.model = model;
        this.modelName = modelName;
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getModelName() {
        return modelName;
    }

    public int getRam() {
        return ram;
    }

    public int getMemory() {
        return memory;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        StringBuilder laptop = new StringBuilder();
        laptop.append("Ноутбук ");
        laptop.append(model);
        laptop.append(" ");
        laptop.append(modelName);
        laptop.append("\n");
        laptop.append(memory);
        laptop.append("/");
        laptop.append(ram);
        laptop.append(" (OS: ");
        laptop.append(os);
        laptop.append("), ");
        laptop.append(color);
        return laptop.toString();
    }
}
