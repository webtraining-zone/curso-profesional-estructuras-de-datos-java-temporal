package zone.webtraining.data.structures.queues;

import zone.webtraining.data.structures.stacks.Stack;

import java.util.Arrays;

class Person {

}

class Book {

}

public class QueueTest {
    public static void main(String[] args) {
        try {
            Queue<Queue<Integer>> queue = new Queue<>();

            for (int i = 0; i < 5; i++) {
                Queue<Integer> newQueue = new Queue<>();
                newQueue.enqueue(i);
                newQueue.enqueue(i + 1);

                queue.enqueue(newQueue);
            }
            System.out.println(queue);
            System.out.println("Dequeue:" + queue.dequeue());
            System.out.println("Dequeue:" + queue.dequeue());
            System.out.println(queue);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
