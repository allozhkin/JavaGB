import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class task1 {
/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}. 
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}. 
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}. 
Распечатайте содержимое данного множества. 
*/
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(set);
        Set <Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(set1);
        System.out.println(set2);
    }
}