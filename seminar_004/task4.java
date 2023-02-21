import java.util.LinkedList;

public class task4 {
    public static void main(String[] args) {
        int[] array = createArray();
        showLinkedList(addToQueue(array));
    }

    public static LinkedList<Integer> addToQueue(int[] array) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer item : linkedList) {
            linkedList.addLast(item);
        }
        return linkedList;
    }

    public static void showLinkedList(LinkedList<Integer> linkedList) {
        for (int item : linkedList) {
            System.out.print(item + "/");
        }
        System.out.println();
        System.err.println(linkedList);
        while (linkedList.size() > 0) {
            System.out.print(linkedList.poll() + " ");
        }
        System.out.println();

    }

    public static int[] createArray() {
        int[] myIntArr = new int[10];
        for (int i = 0; i < myIntArr.length; i++) {
            myIntArr[i] = i;
        }
        return myIntArr;
    }
}
