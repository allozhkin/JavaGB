import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        programm();
    }
    public static void programm() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите строку и число через знак '~' ");
        LinkedList myLinkedList = new LinkedList<>();
        while (true){
            String data = scaner.next();
            String[] stringArr = data.split("~");
            if (Objects.equals(stringArr[0],"print")){
                System.out.println(myLinkedList.remove(Integer.parseInt(stringArr[1])));

            }else{
                myLinkedList.add(Integer.parseInt(stringArr[1]), stringArr[0]);
            }
        }
    }
}
