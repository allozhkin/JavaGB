package HW_003;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] array2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] array3 = new int[array1.length + array2.length];
    
        int i=0, j=0;
        for (int k=0; k<array3.length; k++) {
    
            if (i > array1.length-1) {
                int num = array2[j];
                array3[k] = num;
                j++;
            }
            else if (j > array2.length-1) {
                int num = array1[i];
                array3[k] = num;
                i++;
            }
            else if (array1[i] < array2[j]) {
                int num = array1[i]; 
                array3[k] = num;
                i++;
            }
            else {
                int b = array2[j];
                array3[k] = b;
                j++;
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}