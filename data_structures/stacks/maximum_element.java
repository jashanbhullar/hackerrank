import java.util.Scanner;

class Stack{
	Node top = null;
	int max = 0;
	class Node{
		int data;
		Node next;
	}
	void insert(int data){
		Node node = new Node();
		data = Math.max(max,data);
		max = data;
		node.data = data;
		node.next = top;
		top = node;
	}
	Node deleteTop(){
		Node temp = top;
		top = top.next;
		if(top == null)
            max = 0;
        else
            max = top.data;
		return temp;
	}
	int displayMax(){
		return top.data;
	}	
}

class Solution{
	public static void main(String ... ags){
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		Stack st = new Stack();
		for(int i=0;i<q;i++){
			int a = in.nextInt();
			if(a == 1){
				st.insert(in.nextInt());
			}
			else if(a == 2){
				st.deleteTop();
			}
			else{
				System.out.println(st.displayMax());
			}
		}
	}
}