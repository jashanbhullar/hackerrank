import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		int q = Integer.parseInt(tk.nextToken());
		int [] arr = new int[n];

		tk = new StringTokenizer(in.readLine());
		if(k>=n)
		{
			k = k - (k/n)*n ;
		}
		for(int i=0;i<n;i++)
		{
			int val = i + k ;
			if(val>=n)
			{
				val -= n ;
			}
			arr[val] = Integer.parseInt(tk.nextToken());
		}
		for(int i=0;i<q;i++)
		{
			int val = Integer.parseInt(in.readLine());
			System.out.println(arr[val]);
		}
	}
}