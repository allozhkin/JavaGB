package FinalWorkJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>();
        Laptop lapTop1 = new Laptop(512, 1000, "Windows 8", "White");
        Laptop lapTop2 = new Laptop(128, 512, "Windows 10", "black");
        Laptop lapTop3 = new Laptop(1080, 2000, "Windows 11", "red");
        Laptop lapTop4 = new Laptop(2000, 2500, "MacOS", "Space Gray");
        Laptop lapTop5 = new Laptop(64, 800, "Windows 7", "black");
        Laptop lapTop6 = new Laptop(512, 1000, "MacOS", "Blue");
        Laptop lapTop7 = new Laptop(128, 512, "Windows 10", "Yellow");
        Laptop lapTop8 = new Laptop(1800, 810, "Windows 10", "Green");
        Laptop lapTop9 = new Laptop(128, 512, "MacOS", "black");
        Laptop lapTop0 = new Laptop(64, 215, "Windows 7", "White");

        set.add(lapTop0);
        set.add(lapTop1);
        set.add(lapTop2);
        set.add(lapTop3);
        set.add(lapTop4);
        set.add(lapTop5);
        set.add(lapTop6);
        set.add(lapTop7);
        set.add(lapTop8);
        set.add(lapTop9);

        Map<String, String> filterMap = enterFilter();
        for (Laptop laptop : set) {
            if (selectionByFilter(laptop, filterMap)) {
                System.out.println(laptop);
            }
        }
    }

    public static Map<String, String> enterFilter() {
        Map<String, String> filterMap = new HashMap<>();
        String key = "";
        while (!key.equals("q")) {
            Scanner scn = new Scanner(System.in);
            System.out.println("_____Меню_____\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "q - Выход\n" +
                    "Введите цифру, соответствующую необходимому критерию: ");
            key = scn.nextLine();
            if (!key.equals("q")) {
                System.out.println("Введите значение критерия: \n" +
                        "-> ");
                String value = scn.nextLine();
                filterMap.put(key, value);
            }
        }
        return filterMap;
    }

    public static boolean selectionByFilter(Laptop laptop, Map<String, String> filterMap) {
        Boolean result = false;
        Integer count = 0;
        for (String key : filterMap.keySet()) {
            if (key.equals("1")) {
                int intValue = Integer.parseInt(filterMap.get("1"));
                if (intValue <= laptop.operativeMemory) {
                    count += 1;
                }
            }
            if (key.equals("2")) {
                int intValue = Integer.parseInt(filterMap.get("2"));
                if (intValue <= laptop.hardDisc) {
                    count += 1;
                }
            }
            if (key.equals("3")) {
                if (filterMap.get("3").equals(laptop.oSys)) {
                    count += 1;
                }
            }
            if (key.equals("4")) {
                if (filterMap.get("4").equals(laptop.color)) {
                    count += 1;
                }
            }

            if ((filterMap.keySet().size()) == count) {
                result = true;
            }

        }
        return result;
    }
}
