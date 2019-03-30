   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void topView(Node root) {
      if(root != null){
          leftSide(root.left);
          System.out.print(root.data+" ");
          rightSide(root.right);
      }
    }
    void leftSide(Node root){
        if(root != null){
            leftSide(root.left);
            System.out.print(root.data+" ");   
        }
    }
    void rightSide(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            rightSide(root.right);
        }
    }