/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.
   Node newHead = null;
   while(head != null){
       Node node = new Node();
       node.data = head.data;
       node.next = newHead;
       newHead = node;
       head = head.next;
   }
   while(newHead != null){
       System.out.println(newHead.data);
       newHead = newHead.next;
   }

}
