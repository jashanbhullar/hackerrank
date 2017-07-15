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
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		TreeSet<Integer> ts = new TreeSet<>();
		while(tk.hasMoreTokens())
			ts.add(Integer.parseInt(tk.nextToken()));
		int count = 0;
		while(ts.size()>0)
		{
			int x = ts.first() + 4;
			count++;
			while(ts.size()>0 && ts.first() <= x)
			{
				ts.pollFirst();
			}
		}
		System.out.println(count);
	}
}