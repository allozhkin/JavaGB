package HW_003;

import java.util.ArrayList;
import java.util.Random;
import static java.util.Collections.max;
import static java.util.Collections.min;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
// среднее арифметическое этого списка.
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            arrList.add(random.nextInt(-10,10));
        }
        System.out.println(arrList);
        int max = max(arrList);
        int min = min(arrList);
        int sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            sum+=arrList.get(i);
        }
        float average = sum / arrList.size();
        System.out.println(sum);
        System.out.printf("Минимальное значение списка: %d\nМаксимальное значение списка: %d\nСреднее арифметическое списка: %f", min,max,average);
    }
}
