import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> usersList = fillArr();
        Set<Integer> unique = unique(usersList);
        //процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
        double res = (unique.size()*100.0)/usersList.size();
        System.out.println(res);
    }

    public static LinkedList<Integer> fillArr (){
        Random rnd = new Random();
        LinkedList<Integer> usersArray = new LinkedList<>();
        for (int i = 0; i < 130; i++) {
            usersArray.add(rnd.nextInt(101));
        }
        return usersArray;
    }

    public static Set <Integer> unique (LinkedList<Integer> usersList){
        return new HashSet<>(usersList);
    }
}
