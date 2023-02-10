package HW_001;

import java.util.Scanner;

public class task_003 {
   public static void main(String[] args) {
      Integer num1;
      Integer num2;
      Integer ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите два числа: ");
      num1 = reader.nextInt();
      num2 = reader.nextInt();
      System.out.print("\nВведите оператор (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Введите корректный оператор");
            return;
      }
      System.out.print("\nРезультат:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}