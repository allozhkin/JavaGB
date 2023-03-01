package HW_005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*Пусть дан список сотрудников: 

Иван Иванов, Светлана Петрова, Кристина Белова, 
Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, 
Павел Чернов, Петр Чернышов, Мария Федорова, 
Марина Светлова, Мария Савина, Мария Рыкова, 
Марина Лугова, Анна Владимирова, Иван Мечников, 
Петр Петин, Иван Ежов. 

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap. */
public class task2 {
    public static void main(String[] args) {
        String string = "Иван Иванов,Светлана Петрова,Кристина Белова," +
                "Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков," +
                "Павел Чернов,Петр Чернышов,Мария Федорова," +
                "Марина Светлова,Мария Савина,Мария Рыкова," +
                "Марина Лугова,Анна Владимирова,Иван Мечников," +
                "Петр Петин,Иван Ежов";
        sortedNames(parseString(string));
    }

    public static ArrayList<String> parseString(String s) {
        ArrayList<String> names = new ArrayList<String>();
        String[] s1 = s.split(",");
        for (int i = 0; i < s1.length; i++) {
            String[] s2 = s1[i].split(" ");
            names.add(s2[0]);
        }
        return names;
    }

    static void sortedNames(ArrayList<String> text) {
        Map<String, Integer> treeMap = new TreeMap<>();


        for (String s : text) {
            if (treeMap.containsKey(s)) {
                treeMap.put(s, treeMap.get(s) + 1);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                treeMap.put(s, 1);
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.println(entry);
        }
    }

}
// {Мария=3, Марина=2, Светлана=1, Кристина=1, Анна=3, Иван=4, Петр=3, Павел=1}