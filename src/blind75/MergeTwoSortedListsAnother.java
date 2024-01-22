package blind75;

class Node2 {
    public int data;
    public Node next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedListsAnother {

    public static void printList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node merge(Node h1, Node h2) {
        Node head = new Node(0);
        Node dummy = head;
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                dummy.next = h1;
                h1 = h1.next;
            } else {
                dummy.next = h2;
                h2 = h2.next;
            }
            dummy = dummy.next;
        }
        while (h1 != null) {
            dummy.next = h1;
            h1 = h1.next;
            dummy = dummy.next;
        }
        while (h2 != null) {
            dummy.next = h2;
            h2 = h2.next;
            dummy = dummy.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(5);

        n1.next = n2;
        n2.next = n3;

        Node m1 = new Node(1);
        Node m2 = new Node(2);
        Node m3 = new Node(7);
        Node m4 = new Node(8);

        m1.next = m2;
        m2.next = m3;
        m3.next = m4;

        Node k1 = merge(n1, m1);

        printList(k1);
    }
}

