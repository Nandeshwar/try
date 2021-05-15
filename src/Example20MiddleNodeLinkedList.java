public class Example20MiddleNodeLinkedList {
    public static void main(String[] args) {
        Example20MiddleNodeLinkedList e = new Example20MiddleNodeLinkedList();
        e.addItem("Sita");
        e.addItem("Laxman");
        e.addItem("Ram");
        e.addItem("Hanuman");
        e.addItem("Bharat");

        Node m = e.middleNode();
        System.out.println(m.item);
    }
    class Node {
        String item;
        Node next;
    }

    Node head;
    Node current;

    void addItem(String item) {
        Node node = new Node();
        node.item = item;

        if(head == null) {
            head = node;
            current = head;
            return;
        }

        current.next = node;
        current = current.next;
    }

    Node middleNode() {
        Node head1 = head;
        Node head2 = head;

        while(head2 != null && head2.next != null) {
            head1 = head1.next;
            head2 =head2.next.next;
        }
        return head1;
    }
}
