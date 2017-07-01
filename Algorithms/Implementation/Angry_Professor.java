import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int m = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());

			tk = new StringTokenizer(in.readLine());
			int res=0;
			while(tk.hasMoreTokens())
			{
				int val = Integer.parseInt(tk.nextToken());
				if(val<=0)
					res++;
				if(res>=k)
					break;
			}

			String str = (res>=k) ? "NO" : "YES" ;
			System.out.println(str);
		}
	}
}