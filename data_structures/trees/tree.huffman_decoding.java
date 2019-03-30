/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root){
    StringBuilder ans = new StringBuilder();
    Node pointer = root;
    for(int i=0;i<S.length();i++){
        char ch = S.charAt(i);
        if(ch == '1')
            pointer = pointer.right;
        else if(ch == '0')
            pointer = pointer.left;
        
        if(pointer.right == null && pointer.left == null){
            ans.append(pointer.data);
            pointer = root;
        }
    }
    System.out.println(ans);
}
