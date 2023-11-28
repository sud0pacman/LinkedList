package control_work_list_node;

public class SinglyLinkedList {
    SinglyLinkedList() {
    }

    SinglyLinkedList(Node head) {
    }

    int size = 0;
    Node head;
    Node tail;

    boolean addNode(Node node) {
        Node newElement = new Node(node.val);

        if (tail == null) {
            head = tail = newElement;
        } else {
            tail.next = newElement;
            tail = newElement;
        }

        ++size;

        return true;
    }

    boolean addNode(int val) {
        Node newElement = new Node(val);

        if (tail == null) {
            head = tail = newElement;
        } else {
            tail.next = newElement;
            tail = tail.next;
        }

        ++size;

        return true;
    }

    boolean insertHead(Node node) {
        Node newElement = new Node(node.val);

        if (tail == null) {
            head = tail = newElement;
        } else {
            newElement.next = head;
            head = newElement;
        }

        ++size;
        return true;
    }

    void remove(Node node) {
        if (node.val == head.val) {
            head = head.next;
            --size;
        } else {
            Node curr = head;

            for (int i = 0; i < size && curr.next.val != node.val; i++) {
                curr = curr.next;
            }

            if (tail.val == node.val) {
                curr.next = null;
                tail = curr;
            } else {
                curr.next = curr.next.next;
            }
        }
    }

    void show() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    Node getLast() {
        return tail;
    }

    Node getFirst() {
        return head;
    }

    int getNodeValueByIndex(int index) {
        if (index < 0 || index >= size) {
            return -1;
        } else {
            Node curr = head;
            int ind = 0;
            while (ind < index) {
                ++ind;
                curr = curr.next;
            }

            return curr.val;
        }
    }

    int getLength() {
        return size;
    }
}
