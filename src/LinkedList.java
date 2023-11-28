import java.util.NoSuchElementException;

class ListNode<Type> {
    public Type value;
    public ListNode<Type> next;

    public ListNode(Type element) {
        this.value = element;
    }
}

public class LinkedList<Type> implements ListServices<Type> {
    public int size = 0;

    public ListNode<Type> head;
    public ListNode<Type> tail;

    @Override
    public void add(Type element) {
        ListNode<Type> newElement = new ListNode<>(element);

        if (tail == null) {
            head = tail = newElement;
        }
        else {
            tail.next = newElement;
            tail = newElement;
        }

        ++ size;
    }

    @Override
    public Type get(int pos) {
        if (pos >= size) throw new NoSuchElementException();

        ListNode<Type> currentElement = head;

        for (int i = 1; i < pos; ++i) {
            currentElement = currentElement.next;
        }

        return currentElement.value;
    }

    @Override
    public void remove() {
        if (size == 0) throw new NoSuchElementException();

        if (size == 1) {
            head = null;
            size = 0;
        }

        ListNode<Type> currentElement = head;

        for (int i = 0; i < size - 1; ++i) {
            currentElement = currentElement.next;
        }

        tail = currentElement;
        tail.next = null;
        --size;
    }

    @Override
    public int size() {
        return size;
    }
}
