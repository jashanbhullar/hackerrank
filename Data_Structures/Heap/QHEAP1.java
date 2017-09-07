import java.util.Scanner;
import java.util.PriorityQueue;

class Solution{
	public static void main(String ... ags){
		Scanner in = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int q = in.nextInt();
		for(int t=0;t<q;t++){
			int a = in.nextInt();
			if(a == 1){
				pq.add(in.nextInt());
			}
			else if(a == 2){
				pq.remove(in.nextInt());
			}
			else{
				System.out.println(pq.peek());
			}
		}
	}
}