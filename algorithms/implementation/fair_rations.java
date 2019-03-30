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
		for(int i=0;i<n;i++)
		{
			int val = Integer.parseInt(tk.nextToken());
			if(val%2 != 0)
				ts.add(i);
		}
		if(ts.size()%2 != 0)
			System.out.println("NO");
		else
		{
			int res = 0;
			while(ts.size() != 0)
			{
				int a = ts.pollFirst();
				int b = ts.pollFirst();
				res += (b-a-1)*2 + 2;
			}
			System.out.println(res);
		}
	}
}