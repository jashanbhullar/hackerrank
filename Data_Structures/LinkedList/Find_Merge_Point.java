/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method.
    Node nodeA = headA;
    Node nodeB = headB;
    while(nodeA != nodeB){
        if(nodeA.next == null)
            nodeA = headB;
        else
            nodeA = nodeA.next;
        if(nodeB.next == null)
            nodeB = headA;
        else
            nodeB = nodeB.next;
    }
    return nodeA.data;
}
