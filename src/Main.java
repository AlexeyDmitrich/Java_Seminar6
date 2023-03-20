public class Main {
    public static void main(String[] args) {
        Cat koks = new Cat("Кокс", 7, "кот");
        System.out.println(koks.toString());
        koks.setColor("Рыжий");
        koks.setWeight(6);
        System.out.println(koks.toString());
        koks.vac();
        System.out.println(koks.toString());
        vac(koks);
        System.out.println(koks.toString());
        koks.meow(5);

        Cat noname = new Cat();
        System.out.println(noname.toString());

    }

    public static void vac(Cat cat){
        if (!cat.isVaccine()){
            cat.setVaccine(true);
        }
        else System.out.println("Кот уже привит");
    }
}