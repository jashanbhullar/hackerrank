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
		int [] a1 = new int[n];
		int [] a2 = new int[n];
		int x1 = Integer.MAX_VALUE;
		int y1 = 0;
		int x2 = Integer.MAX_VALUE;
		int y2 = 0;
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			a1[i] = Integer.parseInt(tk.nextToken());
			if(x1 != Math.min(x1,a1[i]))
			{
				x1 = a1[i];
				y1 = i;
			}
		}
		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			a2[i] = Integer.parseInt(tk.nextToken());
			if(x2 != Math.min(x2,a2[i]))
			{
				x2 = a2[i];
				y2 = i;
			}
		}
		int res = 0 ;
		if(y1 != y2)
		{
			res = x1 + x2;
		}
		else if(x1 > x2)
		{
			a2[y2] = Integer.MAX_VALUE;
			x2 = Integer.MAX_VALUE;
			for(int i=0;i<n;i++)
			{
				x2 = Math.min(x2,a2[i]);
			}
			res = x1 + x2;
		}
		else if(x2 > x1)
		{
			a1[y1] = Integer.MAX_VALUE;
			x1 = Integer.MAX_VALUE;
			for(int i=0;i<n;i++)
			{
				x1 = Math.min(x1,a1[i]);
			}
			res = x1 + x2;
		}
		else
		{
			a1[y1] = Integer.MAX_VALUE;
			a2[y2] = Integer.MAX_VALUE;
			x2 = Integer.MAX_VALUE;
			for(int i=0;i<n;i++)
			{
				x2 = Math.min(x2,a1[i]);
				x2 = Math.min(x2,a2[i]);
			}
			res = x1 + x2;
		}
		System.out.println(res);
	}
}