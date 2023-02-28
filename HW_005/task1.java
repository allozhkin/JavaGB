package HW_005;
/*Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов. */

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(112233, "Козлов");
        map.put(123465, "Иванов");
        map.put(1556465, "Петров");
        map.put(123887, "Сидоров");
        map.put(789665, "Козлов");
        map.put(12332325, "Иванов");
        print(map,"Иванов");
    }
    public static void print(Map <Integer, String> Hmap, String name){
        for(Map.Entry<Integer, String> entry: Hmap.entrySet()){
            if (entry.getValue().equals(name)){
                System.out.println(entry);
            }
        }
    }
}
