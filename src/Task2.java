import java.util.HashSet;
import java.util.LinkedHashSet;

public class Task2 {
    //2. Создайте LinkedHashSet,
    // заполните его следующими числами:
    // {1, 2, 30000, 2, 4, 5000, 6, 3}.
    // Распечатайте содержимое данного множества.
    public static void main(String[] args) {
        LinkedHashSet<Integer> users = newSet();
        printSet(users);
    }
    public static LinkedHashSet<Integer> newSet (){
        LinkedHashSet <Integer> res = new LinkedHashSet<>();
        int [] arr = {1, 2, 30000, 2, 4, 5000, 6, 3};
        for (int i = 0; i < arr.length; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    public static void  printSet (LinkedHashSet<Integer> set){
        System.out.println(set.toString());
    }
}
