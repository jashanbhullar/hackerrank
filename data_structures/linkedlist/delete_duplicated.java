/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node pointer) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node head = pointer;
    while(head != null){
        if(head.next != null && head.data == head.next.data){
            head.next = head.next.next;
            continue;
        }
        head = head.next;
    }
    return pointer;

}
