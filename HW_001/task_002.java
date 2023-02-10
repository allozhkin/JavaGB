// Вывести все простые числа от 1 до 1000

package HW_001;

public class task_002 {
    public static void main(String[] args) {
        Integer num = 1000;
        Integer b = 0;
        for (int i = 1; i < num; i++) {
            if (isPrime1(i)) {
                System.out.print(i + "\t");
                b++;
                if (b % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.printf("\r" + "1 к" + num + "Количество простых чисел между \t" + b);
    }

    // Создать метод, чтобы определить, является ли число простым
    public static boolean isPrime1(int i) {
        // Определяем переменную, чтобы судить, простое ли число
        boolean t = false;

        // Когда число равно 2, простое число возвращает true
        if (i == 2) {
            t = true;
        }
        // Когда число не 2, дальнейшее суждение
        for (int j = 2; j < i; j++) {
            if (j == (i - 1)) {
                t = true;
            }
            if ((i % j) == 0) {
                break;
            }
        }
        return t;
    }
}