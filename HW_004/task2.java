package HW_004;
/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: 
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
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
