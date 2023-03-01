package FinalWorkJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class controller {
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
}
