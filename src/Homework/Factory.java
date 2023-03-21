package Homework;

import java.util.Random;

public class Factory {
    Random rnd = new Random();

    public Laptop[] fillStock (int order){
        String[] model = {"Acuc", "Levono", "Intesit", "Sansumg", "Presstiger", "Aker", "Motonola"};
        int[] ram= {2, 4, 8, 16, 32, 64, 128, 256};
        int[] memory= {64, 128, 256, 512, 1024, 2048, 4096};
        String[] os= {"Linux", "MS Dos", "Windows 10", "Android", "FreeBSD"};
        String[] color= {"Черный", "Серый", "Белый"};
        Laptop[] stock = new Laptop[order];
        for (int i = 0; i < stock.length; i++) {
            stock[i] = new Laptop(
                    model[rnd.nextInt(model.length)],
                    modelNameGen(),
                    ram[rnd.nextInt(ram.length)],
                    memory[rnd.nextInt(memory.length)],
                    os[rnd.nextInt(os.length)],
                    color[rnd.nextInt(color.length)]);
        }
        return stock;
    }

    private String modelNameGen (){
        StringBuilder uin = new StringBuilder();
        String[] prefix = {"a","b","c","d","e","f","g","i","k","j","l","m","n","o","p","q","r","s","t","u"};
        Integer body = (rnd.nextInt(3000 - 80) + 80);
        uin.append(prefix[rnd.nextInt(prefix.length)].toUpperCase());
        uin.append(prefix[rnd.nextInt(prefix.length)].toUpperCase());
        uin.append(prefix[rnd.nextInt(prefix.length)].toUpperCase());
        uin.append("-");
        uin.append(body.toString());
        uin.append(prefix[rnd.nextInt(prefix.length)]);
        uin.append(prefix[rnd.nextInt(prefix.length)]);
        return uin.toString();
    }
}
