// LINKED LIST -// Insersion 
                // Deletion 
                // transverse and print 
class LL {

Node head ;
private int size ;
 
LL() {
  this.size = 0 ;
}
 // Node class 
   class Node{
    String data;
    Node next ;

         Node(String data) {
                     this.data = data ;
                     this.next = null;
                     size++ ;
         }
   }
 
  // add node at first
    public void addFirst(String data) {
               Node newNode = new Node(data) ;

               if(head == null) {
                head = newNode ;
                return ;
               }
               newNode.next = head ; 
               head = newNode ;
    }
// add node at last 

public void addLast(String data) {
    Node newNode = new Node(data) ;
   if(head == null) {
    head = newNode ;
    return ;
   }

   Node currNode = head ;  //  important :  we created node pointer which is pointing to head at first 
    while( currNode.next != null) {
        currNode = currNode.next; 
    }
    currNode.next = newNode ;

    }
 // print list 
  public void printLIst() {
    if(head == null) {
        System.out.println("lsit is empty");
        return ;
    }

    Node ptr = head ;
     while(ptr != null) {
        System.out.print(ptr.data + " -> ");
        ptr = ptr.next ;
     }

     System.out.println("NULL");
    
  }  

   // delete first
   public void deleteFirst()
 {
  if(head == null) {
    System.out.println("the linked is empty");
    return ;
     }
     size--;
     head = head.next ;
 }

   // delete last 
    public void deleteLast() {
       if(head == null) {
        return ;
       }
   size--;
       if(head.next == null) {
        head = null ;
        return ;
       }

       Node last = head.next;
       Node second_last = head ;
       while(last.next != null) {
             last = last.next ;
             second_last = second_last.next;
       }
       second_last.next = null ;
    }

    public int getSize() {
      return size ;
    }

   public static void main(String[] args) {
  // linked list ko banane k liye hame ek apni hee class ki object banani padegi 
    LL list = new LL();
    list.addFirst("hello");
    list.addFirst("kity");
    list.printLIst();
    list.addLast("peter");
    list.printLIst();
   } 
}