
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node nextList = null;
        while (current != null) {
            nextList = current.next;
            current.next = prev;
            prev = current;
            current = nextList;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node reversedHead = reverseList(head);
        Node current = reversedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}