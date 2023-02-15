package lection_3;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2598);
        array.add(598);
        array.add(98);
        array.add(258);
        array.add(25);
        array.add(98);
        System.out.println(array);
        System.out.println(array.get(3));  // что стоит на указанном  индексе
        System.out.println(array.indexOf(98)); // Первое вхождение индекса
        System.out.println(array.lastIndexOf(98)); // последнее вхождение индекса
        array.remove(1);   // удаляет элемент на указанном индексе
        array.set(1, 3000);  //   устанавливает элемент на указанный индекс
        System.out.println(array);
        System.out.println(array.subList(2, 4));  // получение элементов от и до
    }
}

