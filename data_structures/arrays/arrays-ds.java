import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int [] ar = new int[n];
		for(int i=0;i<n;i++)
			ar[i] = Integer.parseInt(tk.nextToken());
		for(int i=n-1;i>=0;i--)
			System.out.print(ar[i]+" ");
	}
}