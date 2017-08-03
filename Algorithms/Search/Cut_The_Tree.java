import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;

class Edge
{
	public int x;
	public int y;
	Edge(int x,int y)
	{
		this.x = x;
		this.y = y;
 	}
}
class Solution
{
	static HashMap<Integer,ArrayList<Integer>> hm;
	static int [] ar;
	static boolean [] visit;
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		ar = new int[n+1];
		int sum = 0;
		hm = new HashMap<>();
		for(int i=1;i<=n;i++)
		{
			ar[i] = Integer.parseInt(tk.nextToken());
			sum += ar[i];
			hm.put(i,new ArrayList<Integer>());
		}
		ArrayList<Edge> al = new ArrayList<Edge>();
		for(int i=0;i<n-1;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			hm.get(a).add(b);
			hm.get(b).add(a);
			al.add(new Edge(a,b));
		}
		/*
		for(Integer ob : hm.keySet())
		{
			System.out.println(ob + " "+ hm.get(ob));
		}
		*/
		int min = Integer.MAX_VALUE;
		for(Edge ob : al)
		{
			visit = new boolean[n+1];
			int val = Math.abs(sum - 2*fun(ob.x,ob.y));
			//System.out.println(val);
			min = Math.min(val,min);
		}
		System.out.println(min);
	}
	public static int fun(int x,int y)
	{
		int val = ar[y];
		visit[y] = true;
		for(int ob : hm.get(y))
		{
			if(!visit[ob] && ob != x)
				val += fun(ob); 
		}
		return val;
	}
	public static int fun(int x)
	{
		int val = ar[x];
		visit[x] = true;
		for(int ob : hm.get(x))
		{
			if(!visit[ob])
				val += fun(ob);
		}
		return val;
	}
}