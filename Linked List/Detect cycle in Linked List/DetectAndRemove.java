class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DetectAndRemove {

    public static boolean detectnremove(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // cycle detected
                removeCycle(head, slow); // ✅ remove cycle
                return true;
            }
        }

        return false;
    }

    // Step 2: Remove the cycle
    private static void removeCycle(ListNode head, ListNode meetingPoint) {
        ListNode ptr1 = head;
        ListNode ptr2 = meetingPoint;

        // Find start of cycle
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // Now ptr1 (or ptr2) is at start of cycle
        ListNode start = ptr1;

        // Find last node in cycle and break it
        ListNode temp = start;
        while (temp.next != start) {
            temp = temp.next;
        }
        temp.next = null; // break the cycle
    }

    // Utility to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list with cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head.next; // cycle: 3 → 2

        boolean isCycle = detectnremove(head);
        System.out.println("Cycle detected? " + isCycle);

        // Print list after cycle removal
        printList(head);
    }
}
