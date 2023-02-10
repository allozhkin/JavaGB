// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

// System.out.println(Arrays.toString(nums));  так выводить в консоль массив
package seminar_001;

import java.util.Arrays;

public class task_004 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] arr = str.split(" ");  // парсим  строку через пробел в массив из строк
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
           String temp = arr[i];
           arr[i]= arr[arr.length -1 -i];
           arr[arr.length -1 -i] = temp;
        }
        String my_arr = String.join(" ", arr); // Перевод массива строк в строку
        System.out.println(my_arr);
    }
}
