import java.util.HashMap;
import java.util.HashSet;

public class Task1 {
//    1. Создайте HashSet,
//    заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.
//    Распечатайте содержимое данного множества.
//
public static void main(String[] args) {
HashSet<Integer> usersSet = newSet();
printSet(usersSet);
}
public static HashSet<Integer> newSet (){

    int [] arr = {1, 2, 30000, 2, 4, 5000, 6, 3};
    HashSet <Integer> res = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        res.add(arr[i]);
    }
    return res;
}

public static void  printSet (HashSet<Integer> set){
    System.out.println(set.toString());
}
}
