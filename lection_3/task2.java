package lection_3;

import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("6");
        StringBuilder month = new StringBuilder("October");
        StringBuilder year = new StringBuilder("1993");
        StringBuilder[] data = new StringBuilder[]{day, month, year};
        List<StringBuilder> d = Arrays.asList(data);
        System.out.println(d);
        data[0] = new StringBuilder("06");
        System.out.println(d);
    }
}
