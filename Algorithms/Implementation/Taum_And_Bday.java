import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(in.readLine());
		for(long i=0;i<t;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			long b = Long.parseLong(tk.nextToken());
			long w = Long.parseLong(tk.nextToken());

			tk = new StringTokenizer(in.readLine());
			long x = Long.parseLong(tk.nextToken());
			long y = Long.parseLong(tk.nextToken());
			long z = Long.parseLong(tk.nextToken());

			if(x==y)
			{
				x *= b;
				y *= w;
				x += y;
				System.out.println(x);
			}
			else
			{
				if(x>y+z)
				{
					y *=(b+w);
					x = b*z;
					x += y;
					System.out.println(x);
				}
				else if(y>x+z)
				{
					x *= (b+w);
					y = w*z;
					x += y;
					System.out.println(x);
				}
				else
				{
					x *= b;
					y *= w;
					x += y;
					System.out.println(x);
				}
			}
		}
	}
}