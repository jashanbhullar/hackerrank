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
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int high = Integer.parseInt(tk.nextToken());
		int low = high;
		int c1 = 0;
		int c2 = 0;
		while(tk.hasMoreTokens())
		{
			int val = Integer.parseInt(tk.nextToken());
			if(val>high)
			{
				c1++;
				high=val;
			}
			else if(val<low)
			{
				c2++;
				low=val;
			}
		}
		System.out.println(c1+" "+c2);
	}
}