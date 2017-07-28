import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.HashSet;

class Index
{
	public HashSet<Integer> hs = new HashSet<>();
	Index(int a,int b)
	{
		for(int i=a;i<b;i++)
			hs.add(i);
	}
	public int getVal()
	{
		return hs.size();
	}
	public void setVal(int a,int b)
	{
		for(int i=a;i<b;i++)
			hs.add(i);
	}
}
class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		long res = n*m;
		HashMap<Integer,Index> hm = new HashMap<>();
		for(int i=0;i<k;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int r = Integer.parseInt(tk.nextToken());
			int a = Integer.parseInt(tk.nextToken())-1;
			int b = Integer.parseInt(tk.nextToken());
			try
			{
				Index temp = hm.get(r);
				temp.setVal(a,b);
				hm.put(r,temp);
			}
			catch(Exception e)
			{
				hm.put(r,new Index(a,b));
			}
		}
		for(Index ob : hm.values())
			res -= ob.getVal();
		System.out.println(res);
	}
}