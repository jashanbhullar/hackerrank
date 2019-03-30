import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int [] ar = new int[n];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++){
			ar[i] = Integer.parseInt(tk.nextToken());
		}
		ArrayList<Integer> al = new ArrayList<>();
		for(int ob : ar){
			int val = al.indexOf(ob);
			if(val == -1){
				al.add(ob);
			}
			else{
				al.remove(val);
			}
		}
		System.out.println(al.get(0));
	}
}