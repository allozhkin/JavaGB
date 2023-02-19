package HW_003;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            arrList.add(random.nextInt(-10,10));
        }
        System.out.println(arrList);
        int i = 0;
        while (i < arrList.size()) {
            if (arrList.get(i) %2 == 0 ){
                arrList.remove(i);
            }
            else{
                i++;
            }
        }
        System.out.println(arrList);
    }
}
