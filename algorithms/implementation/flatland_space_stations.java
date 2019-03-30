import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		if( n == m)
		{
			System.out.println("0");
			System.exit(0);
		}
		TreeSet<Integer> ts = new TreeSet<>();
		while(tk.hasMoreTokens())
			ts.add(Integer.parseInt(tk.nextToken()));
		System.out.println(ts);
		int start = ts.first() - 0;
		int last = n - 1 - ts.last();
		int max = 0;
		while(ts.size() != 0)
		{
			int a = ts.pollFirst();
			try
			{
				int b = ts.first();
				max = Math.max(max,b-a);
			}catch(java.util.NoSuchElementException e)
			{}
		}
		max = max/2;
		max = Math.max(max,start);
		max = Math.max(max,last);
		System.out.println(max);
	}
}