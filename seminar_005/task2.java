package seminar_005;
import java.util.*;
public class task2 {
    public static void main(String[] args) {
        System.out.println(method("paper","title"));
    }
    static boolean method(String one, String two){
        Map<Character, Character> map = new HashMap<>();
        if (one.length() != two.length())return false;

        char[] array = one.toCharArray();
        char[] arraY = two.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                if(map.get(array[i]) != (arraY[i])){
                    return false;
                } 
            }else{
                map.put(array[i], arraY[i]);
            } 
        }
        return true;
    }
}
