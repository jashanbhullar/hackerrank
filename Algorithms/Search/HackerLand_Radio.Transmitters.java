import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		int [] ar = new int[n];
		for(int i=0;i<n;i++)
			ar[i] = Integer.parseInt(tk.nextToken());

		Arrays.sort(ar);
		int a = 0;
		int b = 0;
		int res = 0;
		for(int i=0;i<n;i++)
		{
			int val = ar[i];
			while( i < n && (ar[i]-val) <= k )
				i++;
			val = ar[--i];
			while( i < n && (ar[i]-val) <= k )
				i++;
			i--;
			res++;
		}
		System.out.println(res);
	}
}