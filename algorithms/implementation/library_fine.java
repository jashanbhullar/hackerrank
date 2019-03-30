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
		int d1 = Integer.parseInt(tk.nextToken());
		int m1 = Integer.parseInt(tk.nextToken());
		int y1 = Integer.parseInt(tk.nextToken());

		tk = new StringTokenizer(in.readLine());

		int d2 = Integer.parseInt(tk.nextToken());
		int m2 = Integer.parseInt(tk.nextToken());
		int y2 = Integer.parseInt(tk.nextToken());

		if(y1-y2>0)
			System.out.println("10000");
		else if(y2-y1>0)
			System.out.println("0");
		else if(m1-m2>0)
		{
			int fine = 500 * (m1-m2);
			System.out.println(fine);
		}
		else if(m2-m1>0)
			System.out.println("0");
		else if(d1-d2>0)
		{
			int fine = 15 * (d1-d2);
			System.out.println(fine);
		}
		else
		{
			System.out.println(0);
		}
	}
}