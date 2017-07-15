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
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			StringTokenizer tka = new StringTokenizer(in.readLine());
			StringTokenizer tkb = new StringTokenizer(in.readLine());
			int [] a = new int[n];
			int [] b = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = Integer.parseInt(tka.nextToken());
				b[i] = Integer.parseInt(tkb.nextToken());
			}
			Arrays.sort(a);
			Arrays.sort(b);
			String res = "YES";
			for(int i=0;i<n;i++)
			{
				int x = a[i];
				int y = b[n-i-1];
				if( (x + y) < k )
				{
					res = "NO";
					break;
				}
			}
			System.out.println(res);
		}
	}
}