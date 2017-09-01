/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node nodeA, Node nodeB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
    Node newHead = null;
    Node currNode = null;
    while(nodeA != null && nodeB != null){ 
        Node node = new Node();
        if(nodeA.data <= nodeB.data){
            if(newHead == null){
                    newHead = new Node();
                    newHead.data = nodeA.data;
                    currNode = newHead;
                    nodeA = nodeA.next;
                }else{                
                    node.data = nodeA.data;
                    currNode.next = node;
                    currNode = node;
                    nodeA = nodeA.next;
                }
        }else{
            if(newHead == null){
                newHead = new Node();
                newHead.data = nodeB.data;
                currNode = newHead;
                nodeB = nodeB.next;
            }
            else{
                node.data = nodeB.data;
                currNode.next = node;
                currNode = node;
                nodeB = nodeB.next;
            }
        }
    }
    while(nodeB != null){
        Node node = new Node();
        if(newHead == null){
            newHead = new Node();
            newHead.data = nodeB.data;
            currNode = newHead;
            nodeB = nodeB.next;
        }else{
            node.data = nodeB.data;
            currNode.next = node;
            currNode = node;
            nodeB = nodeB.next;
        }
    }
    while(nodeA != null){
        Node node = new Node();
        if(newHead == null){
            newHead = new Node();
            newHead.data = nodeA.data;
            currNode = newHead;
            nodeA = nodeA.next;
        }else{                
            node.data = nodeA.data;
            currNode.next = node;
            currNode = node;
            nodeA = nodeA.next;
        }
    }
    return newHead;
}
