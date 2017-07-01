import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int top = Integer.parseInt(tk.nextToken());
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(top);
		while(tk.hasMoreTokens())
		{
			int val = Integer.parseInt(tk.nextToken());
			if(val!=top)
			{
				al.add(val);
				top=val;
			}
		}
		//System.out.println(al);
		int m = Integer.parseInt(in.readLine());
		tk = new StringTokenizer(in.readLine());
		int rank = al.size()-1;
		while(tk.hasMoreTokens())
		{
			top = Integer.parseInt(tk.nextToken());
			rank = Solution.fun(al,top,rank);
			System.out.println(rank);
		}
	}
	static int fun(ArrayList<Integer> al, int score, int n)
	{
		if(n==al.size())
			n -= 1;
		for(int i=n;i>0;i--)
		{
			int val = al.get(i);
			if(val>score)
			{
				return i+1;
			}
			else if(val==score)
				return i;
		}
		return 1;
	}
}