import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i=0;i<n;i++){
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int val = Integer.parseInt(tk.nextToken());
			if(val == 1){
				val = Integer.parseInt(tk.nextToken());
				ll.addLast(val);
			}
			else if(val == 2){
				ll.removeFirst();
			}
			else{
				System.out.println(ll.getFirst());
			}
		}
	}
}