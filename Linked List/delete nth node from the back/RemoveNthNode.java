// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        int size = 0;
        ListNode curr = head;

        // Find size of list
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // If we need to remove the first node
        if (size == n) {
            return head.next;
        }

        // Find (size - n)th node
        int index = size - n;
        ListNode ptrindex = head;
        for (int i = 1; i < index; i++) {
            ptrindex = ptrindex.next;
        }

        // Remove nth node from end
        ptrindex.next = ptrindex.next.next;

        return head;
    }

    // helper method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // main method to test
    public static void main(String[] args) {
        // create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        RemoveNthNode obj = new RemoveNthNode();
        head = obj.removeNthFromEnd(head, 2); // remove 2nd from end

        System.out.print("After Removing 2nd From End: ");
        printList(head);
    }
}
