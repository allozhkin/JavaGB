package seminar_002;

import java.io.FileWriter;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) throws IOException {
        StringBuilder s = new StringBuilder();
        Integer count = 0;
        for (int i = 0; i < 100; i++) {
            s.append("test ");
            ++count;
        }
        String s1 = new String(s);
        System.out.println(s1 + count);
        try (FileWriter our_writer = new FileWriter("f1")) {
            our_writer.write(s1);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
