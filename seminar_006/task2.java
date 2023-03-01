import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.

2. Создайте метод, в который передайте заполненный выше массив и с помощью Set 
вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве. 
*/


public class task2 {
    public static void main(String[] args) {
        Integer[] array = getArray(0,25,123);
        // System.out.println(Arrays.toString(array));
        System.out.println(unicValue(array));

    }
    // Метод создания массива
    private static Integer[] getArray(int min, int max, int size){
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min,max);
        }
        return array;
    }
    // Метод вычесления процента уникальных чисел
    private static Double unicValue(Integer[] arr){
        double uV= 0;
        Set <Integer> set = new HashSet<>(Arrays.asList(arr));
        uV = (set.size() * 100.0)/arr.length;
        return uV;
    }
}
