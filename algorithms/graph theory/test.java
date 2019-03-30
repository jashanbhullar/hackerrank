import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.io.FileReader;
import java.io.File;

class Graph
{
	int city;
	boolean marked=false;
	ArrayList<Graph> roads = new ArrayList<>();
	static long amount=0;
	static long croad=0;
	Graph(int city)
	{
		this.city=city;
	}
	public void addroad(Graph b)
	{
		this.roads.add(b);
		b.roads.add(this);
	}
	public void mark()
	{
		this.marked=true;
	}
	static void fun(Graph ob, long deep)
	{
		if(!ob.marked)
		{
			ob.mark();
			//System.out.println(ob.city+" :Road");
			Graph.amount=Graph.amount+Graph.croad;
			deep--;
			if(deep!=0)
			{
				for(Graph obd : ob.roads)
				{
					Graph.fun(obd,deep);
				}
			}
		}
	}
}
class Sorting implements Comparator <Graph>
{
	public int compare(Graph a,Graph b)
	{
		return b.roads.size()-a.roads.size();
	}
}
class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader(new File("input10.txt")));
		int q = Integer.parseInt(in.readLine());
		for(int k=0;k<q;k++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());
			ArrayList<Graph> al = new ArrayList<>();
			long clib = Long.parseLong(tk.nextToken());
			long croad = Long.parseLong(tk.nextToken());
			Graph.amount=0;
			Graph.croad=croad;
			long amount=0;
			if(croad>=clib)
			{
				amount=n*clib;
				for(int i=0;i<m;i++)
				{
					in.readLine();
				}
			}
			else
			{
				for(int i=1;i<=n;i++)
				{
					Graph temp = new Graph(i);
					al.add(temp);
				}
				for(int i=0;i<m;i++)
				{
					tk = new StringTokenizer(in.readLine());
					int u = Integer.parseInt(tk.nextToken())-1;
					int v = Integer.parseInt(tk.nextToken())-1;
					al.get(u).addroad(al.get(v));
				}
				Collections.sort(al,new Sorting());
					/*
				for(Graph ob : al)
				{
					System.out.println(ob.city+" "+ob.marked+" "+ob.roads.size());
				}
					*/
				for(Graph ob : al)
				{
					if(!ob.marked)
					{
						long deep=clib/croad;
						ob.mark();
						amount=amount+clib;
						//System.out.println(ob.city+" :Lib");
						for(Graph obd : ob.roads)
						{
							Graph.fun(obd,deep);
						}
					}
				}
					/*
				for(Graph ob : al)
				{
					System.out.println(ob.city+" "+ob.marked+" "+ob.roads.size());
				} 
					*/
				amount=amount+Graph.amount;
			}
			System.out.println(amount);
		}
	}
}