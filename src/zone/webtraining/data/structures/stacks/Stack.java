package zone.webtraining.data.structures.stacks;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Stack<E> {
    private LinkedList<E> elements;

    public Stack() {
        this.elements = new LinkedList<>();
    }

    public void push(E element) {
        this.elements.addFirst(element);
    }

    public E pop() {
        E element = this.elements.getFirst();
        this.elements.removeFirst();

        return element;
    }

    public E peek() {
        E element = this.elements.getFirst();

        return element;
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override
    public String toString() {

        StringJoiner stringJoiner = new StringJoiner("\n----\n", "", "");

        for (E element : this.elements) {
            stringJoiner.add(element.toString());
        }

        return stringJoiner.toString();
    }


}
