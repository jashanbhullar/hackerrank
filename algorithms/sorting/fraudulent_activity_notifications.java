import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int d = Integer.parseInt(tk.nextToken());

		tk = new StringTokenizer(in.readLine());
		int [] ar = new int[201];
		ArrayList<Integer> md = new ArrayList<>();
		for(int i=0;i<d;i++)
		{
			int val = Integer.parseInt(tk.nextToken());
			md.add(val);
			ar[val]++;
		}
		int res = 0;
		int x = 0;
		int y = 0;
		if(d % 2 == 0)
		{
			x = d/2+1;
			y = x - 1;
		}
		else
		{
			x = d/2+1;
			y = x;
		}
		for(int i=d;i<n;i++)
		{
			int next = Integer.parseInt(tk.nextToken());
			int sum = 0;
			int val = 0;
			boolean xflag = false, yflag = false;
			for(int j=0;j<201;j++)
			{
				//System.out.print(ar[j]+"  ");
				sum += ar[j];
				if(!xflag &&sum >= x)
				{
					//System.out.println("x "+j);
					val += j;
					xflag = true;
				}
				if(!yflag && sum >= y)
				{
					//System.out.println("y "+j);
					val += j;
					yflag = true;
				}
				if(xflag && yflag)
					break;
			}
			//System.out.println(md);
			ar[next]++;
			//System.out.println(val);
			ar[md.remove(0)]--;
			if(next >= val)
				res++;
			md.add(next);
			//System.out.println(md);
		}
		System.out.println(res);
	}
}