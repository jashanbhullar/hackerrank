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
		Long k = Long.parseLong(tk.nextToken());
		long[] ar = new long[n];
		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
			ar[i] = Long.parseLong(tk.nextToken());
		Arrays.sort(ar);
		int res = 0;
		for(int i=n-1;i>0;i--)
		{
			long val = ar[i] - k;
			for(int j=i-1;j>=0;j--)
			{
				if( ar[j] == val )
				{
					res++;
					break;
				}
				else if( ar[j] < val)
					break;
			}
		}
		System.out.println(res);
	}
}