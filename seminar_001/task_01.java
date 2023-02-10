package seminar_001;


// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class task_01 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (temp < count)
                    ;
                temp = count;
                count = 0;
            }
            if (temp < count) {
                temp = count;
            }
        }
        System.out.printf("количество единиц: %d", count);
    }
}