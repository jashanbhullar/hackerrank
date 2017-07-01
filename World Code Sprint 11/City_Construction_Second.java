import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.ArrayList;

class Map
{
	HashSet<Integer> conn;
	HashSet<Integer> road;
	Map(HashSet<Integer> conn,HashSet<Integer> road)
	{
		this.conn=conn;
		this.road=road;
	}
	void display()
	{
		System.out.println("Road to    "+this.road);
		System.out.println("Conn to    "+this.conn);
		System.out.format("%n%n");
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
		ArrayList<Map> al = new ArrayList<>();
		for(int i=0;i<=n;i++)
		{
			HashSet<Integer> conn = new HashSet<>();
			HashSet<Integer> road = new HashSet<>();
			road.add(i);
			Map temp = new Map(conn,road);
			al.add(temp);
		}
		for(int i=0;i<m;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int u = Integer.parseInt(tk.nextToken());
			int v = Integer.parseInt(tk.nextToken());
			Map a = al.get(u);
			Map b = al.get(v);
			a.road.add(v);
			b.conn.add(u);
			a.road.addAll(b.road);
			b.conn.addAll(a.conn);
			for(Integer ob : a.conn)
			{
				al.get(ob).road.addAll(a.road);
			}
		}
			/*
		for(int i=1;i<al.size();i++)
		{
			System.out.println(i);
			al.get(i).display();
		}
			*/
		int q = Integer.parseInt(in.readLine());
		for(int i=0;i<q;i++)
		{
			tk = new StringTokenizer(in.readLine());
			boolean bool = tk.nextToken().equals("1") ? true : false;
			if(bool)
			{
				n += 1;
				HashSet<Integer> conn = new HashSet<>();
				HashSet<Integer> road = new HashSet<>();
				road.add(n);
				Map temp = new Map(conn,road);
				al.add(temp);
				int x = Integer.parseInt(tk.nextToken());
				int d = Integer.parseInt(tk.nextToken());
				if(d==0)
				{
					Map a = al.get(x);
					Map b = al.get(n);
					a.road.add(n);
					b.conn.addAll(a.conn);
					b.conn.add(x);
					for(Integer ob : a.conn)
					{
						al.get(ob).road.add(n);
					}
				}
				else
				{
					Map a = al.get(n);
					Map b = al.get(x);
					a.road.addAll(b.road);
					b.conn.add(n);
				}
					/*
				for(int j=1;j<al.size();j++)
				{
					System.out.println(j);
					al.get(j).display();
				}
					*/
			}
			else
			{
				int u = Integer.parseInt(tk.nextToken());
				int v = Integer.parseInt(tk.nextToken());
				if(al.get(u).road.contains(v))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
}