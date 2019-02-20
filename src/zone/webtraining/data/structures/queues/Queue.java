package zone.webtraining.data.structures.queues;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Queue<E> {
    private LinkedList<E> elements;

    public Queue() {
        this.elements = new LinkedList<>();
    }

    public void enqueue(E element) {
        this.elements.addLast(element);
    }

    public E dequeue() {
        E element = this.elements.getFirst();
        this.elements.removeFirst();

        return element;
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override
    public String toString() {

        StringJoiner stringJoiner = new StringJoiner(" <- ", "[", "]");

        for (E element : this.elements) {
            stringJoiner.add(element.toString());
        }

        return stringJoiner.toString();
    }


}
