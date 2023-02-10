// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".


package seminar_001;
public class task_003 {
    public static void main(String[] args) {
        String[] arr = new String[]{"просто", "так", "ничего", "не", "случается"};
        String temp = "";
        String pref= "а";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(pref)){ // проверяет подстроки в строке
                if (temp.length() < arr[i].length()){
                    temp = arr[i];
                }
                
            }
        }
        System.out.println(temp);

    }
}
