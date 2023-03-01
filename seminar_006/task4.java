import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class task4 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat("red","HeLLBoy",LocalDate.of(2006, 6, 6));
        Cat cat2 = new Cat("red","HellBOy",LocalDate.of(2006, 6, 6));
        Cat cat3 = new Cat("red","HEllBoy",LocalDate.of(2006, 6, 6));



        set.add(cat1);
        set.add(cat2);
        set.add(cat3);

        System.out.println(set);
    }
}
