package seminar_003;

import java.util.*;

public class task2 {
    public static void main(String[] args) {

        Random rn = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add(rn.nextInt(10, 100));
        }
        Collections.sort(arr);
        System.out.println(arr);
        
    }
}
