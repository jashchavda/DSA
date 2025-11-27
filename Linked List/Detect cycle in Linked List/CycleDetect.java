import java.util.List;

public class CycleDetect {
  public static class ListNode {
       int val ; 
       ListNode next ; 

       ListNode(int val) {
          this.val = val ;
          this.next = null ; 
       }

       
  }

  public static boolean detectCycle(ListNode head) {


          if(head == null || head.next == null) {
                        return false ; 
          }

          ListNode slow = head ; 
          ListNode fast = head ; 

          while(fast != null && fast.next != null) {
            fast = fast.next.next ; 
            slow = slow.next ; 

            if(slow == fast) {
                return true ;
          }
          }

          return false ;


       }

 public static void main(String[] args) {
       CycleDetect obj = new CycleDetect();   
       ListNode head = new ListNode(1); 
       head.next = new ListNode(2);
       head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(8); 
        head.next.next.next = head.next ;

        boolean result = detectCycle(head);

        System.out.println(result);
 }
}