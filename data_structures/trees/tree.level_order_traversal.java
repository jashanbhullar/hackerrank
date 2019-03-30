   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       LinkedList<Node> ll = new LinkedList<>();
       ll.add(root);
       while(ll.size() != 0){
           Node temp = ll.pop();
           System.out.print(temp.data+" ");
           if(temp.left != null)
               ll.add(temp.left);
           if(temp.right != null)
               ll.add(temp.right);
       }

      
    }
