package HW_004;

import java.util.Arrays;
import java.util.LinkedList;

import java.util.Iterator;

/*
 * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.
 */
public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Iterator<Integer> iterator = linkedList.iterator();

        int sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }

        System.out.println(sum); 
    }
}
