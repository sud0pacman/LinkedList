package control_work_list_node;

public class NodeMain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);

        list.addNode(node);
        list.addNode(node1);
        list.addNode(node2);
        list.insertHead(node3);
        list.show();
        System.out.println();
    }
}
