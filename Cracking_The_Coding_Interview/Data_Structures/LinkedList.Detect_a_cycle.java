/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node tmp = head;
    ArrayList<Node> al = new ArrayList<>();
    while(tmp != null ){
        if(al.contains(tmp))
            return true;
        al.add(tmp);
        tmp = tmp.next;
    }
    return false;

}
