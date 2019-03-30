/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
     java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
     int i = 0;
    while(head != null){
        hm.put(i,head.data);
        head = head.next;
        i++;
    }
    i = i - 1 - n;
    return hm.get(i);
    
}
