	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        int n = -1;
        int m = -1;
        if(root != null){
            n = 1 + height(root.left);
            m = 1 + height(root.right);
        }
        return Math.max(n,m);
    }
