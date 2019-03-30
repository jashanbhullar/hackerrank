import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//import java.util.Arrays;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int cost = Integer.parseInt(tk.nextToken());
		int n = Integer.parseInt(tk.nextToken());
		int [] ar = new int[n];
		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
			ar[i] = Integer.parseInt(tk.nextToken());
		//Arrays.sort(ar);
		System.out.println(count(cost,ar));
	}
	public static long count(int cost,int [] ar){
		long[] ans = new long[cost+1];
		ans[0] = (long)1;
		for(int ob : ar){
			for(int j=ob ; j<ans.length;j++){
				ans[j] += ans[j-ob];
			}
		}
		return ans[cost];
	}
}