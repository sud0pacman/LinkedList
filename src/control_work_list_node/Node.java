package control_work_list_node;

public class Node {
    int val;
    Node next;

    Node() {}
    Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
