package blind75;


class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemovesDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode sHead = new ListNode(), node = head;
        ListNode sTail = sHead;

        while(node!=null) {
            while(node.next!=null && node.next.val==node.val) {
                node = node.next;
            }
            ListNode next = node.next;
            node.next = null;
            sTail.next = node;
            sTail = node;
            node = next;
        }
        return sHead.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode k1 = deleteDuplicates(n1);
        printList(k1);
    }

    public static void printList(List`Node head) {
        while(head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
