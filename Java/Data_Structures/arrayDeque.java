import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		tk = new StringTokenizer(in.readLine());
		int max=0;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			int val = Integer.parseInt(tk.nextToken());

			ad.add(val);
			hs.add(val);

			if(ad.size()==m+1)
			{
				val = ad.remove();
				if(!ad.contains(val))
				{
					hs.remove(val);
				}
			}
			max = Math.max(hs.size(),max);
		}
		System.out.println(max);
	}
}