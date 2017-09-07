import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		long [] ar = new long[n];
		for(int i=0;i<m;i++){
			tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken())-1;
			int b = Integer.parseInt(tk.nextToken());
			int val = Integer.parseInt(tk.nextToken());
			ar[a] += val;
			if(b < n)
				ar[b] -= val;
		}
		long max = 0;
		long x = 0;
		for(int i=0;i<n;i++){
			x += ar[i];
			max = Math.max(max,x);
		}
		System.out.println(max);
	}
}