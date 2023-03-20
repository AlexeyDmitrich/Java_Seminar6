public class Cat {
    private String name;
    private double age;
    private String sex;
    private boolean vaccine;
    private double weight;
    private String color;


    public Cat(String name, double age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.color = "Белый";
        this.weight = 8;
    }

    public Cat() {
        this.name = "Felix";
        this.age = 5;
        this.sex = "кошка";
        this.color = "Белый";
        this.weight = 8;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVaccine() {
        return vaccine;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public void vac (){
        if (!this.isVaccine()){
            this.setVaccine(true);
        }
        else System.out.println("Кот уже привит");
    }

    public void meow(int value){
        System.out.printf("%s говорит МЯЯЯУ!!! %d раз", this.name, value);
    }



    @Override
    public String toString() {
        String res = new String();
        res += "Cat";
        res += "\n";
        res += sex;
        res += "\nИмя=";
        res += name;
        res += "\nВозраст=";
        res += age;
        res += "\nВес=";
        res +=  weight;
        res +=  "\nЦвет=";
        res += color;
        if (vaccine){
            res+= "\nВакцинирован";
        }
        else {
            res += "\nНе привит";
        }
        return res;
    }
}
