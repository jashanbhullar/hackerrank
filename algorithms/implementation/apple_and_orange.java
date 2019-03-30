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
		int s = Integer.parseInt(tk.nextToken());
		int t = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		int a = Integer.parseInt(tk.nextToken());
		int b = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		int m = Integer.parseInt(tk.nextToken());
		int n = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		int apples = 0;
		int oranges = 0;
		for(int i=0;i<m;i++)
		{
			int x = Integer.parseInt(tk.nextToken())+a;
			if(x>=s && x<=t)
			{
				apples++;
			}
		}
		System.out.println(apples);
		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			int x = Integer.parseInt(tk.nextToken())+b;
			if(x>=s && x<=t)
			{
				oranges++;
			}
		}
		System.out.println(oranges);
	}
}