// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.

package seminar_001;

public class task_002 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3,2};
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 3){
                temp = arr[i];
                for (int j = i+1; j < arr.length; j++){
                    if (arr[j] != 3){
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                } 
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        
    }

}
