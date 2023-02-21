import java.util.Stack;

import javax.print.attribute.standard.MediaSizeName;

public class task3 {
    public static void main(String[] args) {
        int[] array = createArray();
        showStack(addToStack(array));

    }

    private static void showStack(Stack<Integer> stack) {
        for (int item : stack) {
            System.out.print(item + "/");
        }
        System.out.println();
        while (stack.size()>0){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        System.err.println(stack);

    }

    private static Stack<Integer> addToStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        return stack;
    }

    private static int[] createArray() {
        int[] myIntArr = new int[10];
        for (int i = 0; i < myIntArr.length; i++) {
            myIntArr[i] = i;
        }
        return myIntArr;
    }
}
