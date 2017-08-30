import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int d = Integer.parseInt(tk.nextToken());
		int [] ar = new int[n];
		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++){
			ar[i] = Integer.parseInt(tk.nextToken());
		}
		int [] res = new int [n];
		d = d - (d/n)*n; 
		for(int i=0;i<n;i++){
			int val = i + d;
			if(val < n){
				res[i] = ar[val];
			}
			else{
				val -= n;
				res[i] = ar[val];
			}
			System.out.print(res[i]+" ");
		}	
	}
}