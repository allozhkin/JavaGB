package HW_004;

public class task2 {
    public static void main(String[] args) {
        myQueue queue = new myQueue();
        queue.enqueue( 1);
        queue.enqueue( 2);
        queue.enqueue( 3);

        System.out.println(queue.first()); // 1
        queue.dequeue();
        System.out.println(queue.first()); // 2
        queue.dequeue();
        System.out.println(queue.first()); // 3
        queue.dequeue();
    }
}
