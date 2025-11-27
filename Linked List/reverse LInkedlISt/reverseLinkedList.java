class Node {
   int data ; 
   Node next ;
     Node(int data) {
        this.data = data ;
        this.next = null ;
     }

}


public class reverseLinkedList {
  
  public static void printList(Node head) {
  
   Node ptr = head ;
   while( ptr != null) {
      System.out.print(ptr.data + "->");
      ptr= ptr.next ;
   }
   System.out.println("null");
  }     

  public static Node reverseList(Node head) {
    
     Node prev = null ;
     Node curr = head ;
     Node next = null ;
     
     while(curr != null) {
      next = curr.next ;
      curr.next = prev ; 
      prev = curr ;
      curr = next ;
     }

     return prev ;

  }
  


  public static void main(String[] args) {

   
     Node head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(30);


       printList(head);
       head = reverseList(head);
       
       printList(head);

  }
    
}