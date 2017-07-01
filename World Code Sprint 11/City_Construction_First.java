import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.HashMap;

class Solution
{
	public static void display(HashMap<Integer,HashSet<Integer>> hm)
	{
		for(int i=1;i<=hm.size();i++)
		{
			System.out.println("City :"+i);
			System.out.println("      "+hm.get(i));
		}
	}
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		HashMap<Integer,HashSet<Integer>> hm = new HashMap<>();
		for(int i=1;i<=n;i++)
		{
			HashSet<Integer> hs = new HashSet<>();
			hs.add(i);
			hm.put(i,hs);
		}
		for(int i=0;i<m;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int u = Integer.parseInt(tk.nextToken());
			int v = Integer.parseInt(tk.nextToken());
			hm.get(u).add(v);
			hm.get(u).addAll(hm.get(v));
		}
		for(int i=1;i<=n;i++)
		{
			HashSet<Integer> hs = hm.get(i);
			HashSet<Integer> hsnew = new HashSet<>();
			for(Integer ob : hs)
			{
				HashSet<Integer> obhs = hm.get(ob);
				hsnew.addAll(obhs);
			}
			hm.get(i).addAll(hsnew);
		}
		//Solution.display(hm);
		int q = Integer.parseInt(in.readLine());
		for(int i=0;i<q;i++)
		{
			tk = new StringTokenizer(in.readLine());
			boolean bool = tk.nextToken().equals("1") ? true : false;
			if(bool)
			{
				n=n+1;
				int x = Integer.parseInt(tk.nextToken());
				int d = Integer.parseInt(tk.nextToken());
				if(d==0)
				{
					hm.get(x).add(n);
					HashSet<Integer> hs = new HashSet<>();
					hs.add(n);
					hm.put(n,hs);
				}
				else
				{
					HashSet<Integer> hs = new HashSet<>();
					hs.addAll(hm.get(x));
					hs.add(n);
					hm.put(n,hs);
				}
				for(int j=1;j<=n;j++)
				{
					HashSet<Integer> hs = hm.get(j);
					HashSet<Integer> hsnew = new HashSet<>();
					for(Integer ob : hs)
					{
						HashSet<Integer> obhs = hm.get(ob);
						hsnew.addAll(obhs);
					}
					hm.get(j).addAll(hsnew);
				}
				//Solution.display(hm);
			}
			else
			{
				int x = Integer.parseInt(tk.nextToken());
				int y = Integer.parseInt(tk.nextToken());
				HashSet<Integer> hs = hm.get(x);
				if(hs.contains(y))
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}
			}
		}
	}
}