/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    Node node = new Node();
    node.data = data;
    
    if(position == 0) {
        node.next = head;
        return node;
    }
    
    Node pointer = head;
    int i = 0;
    while(i != position - 1) {
        pointer = pointer.next;
        i++;
    }
    
    node.next = pointer.next;
    pointer.next = node;
    return head;
}