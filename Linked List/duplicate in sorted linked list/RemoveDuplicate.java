class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
    }
}

public class RemoveDuplicate {

    // Function to remove duplicates from a sorted linked list
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;  // handle empty list

        ListNode current = head;

        // Traverse the list while there is a next node
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Duplicate found, skip the next node
                current.next = current.next.next;
            } else {
                // Move forward if no duplicate
                current = current.next;
            }
        }

        return head;
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: [1,1,2,3,3]
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        RemoveDuplicate obj = new RemoveDuplicate();
        ListNode result = obj.deleteDuplicates(head);

        printList(result); // Output: 1 2 3
    }
}
