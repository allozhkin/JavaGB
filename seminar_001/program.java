package seminar_001;

import java.time.LocalDateTime;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        System.out.println("hello ");
        Scanner iScanner = new Scanner(System.in);

        String name = iScanner.nextLine();  // работа с пользователем
        System.out.printf("Привет, %s", name);
        iScanner.close();
        System.out.println();


        int[] arr1 = new int [10]; //массивы
        int[] arr2 = new int []{1,2,3,4,5,6,7};
        System.out.printf("вывод на консоль по индексу %d, %d", arr1[3],arr2[0]);
        
        System.out.println();
        System.out.println(LocalDateTime.now());

        

    }
}