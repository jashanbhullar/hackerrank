import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

class Solution
{
	static void display(HashMap<Integer,ArrayList<Integer>> hm)
	{
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
		for(int i=1;i<=n;i++)
		{
			ArrayList<Integer> al = new ArrayList<>();
			hm.put(i,al);
		}
		for(int i=0;i<m;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int u = Integer.parseInt(tk.nextToken());
			int v = Integer.parseInt(tk.nextToken());
			hm.get(u).add(v);
		}
		//Solution.display(hm);
		int q = Integer.parseInt(in.readLine());
		for(int i=0;i<q;i++)
		{
			tk = new StringTokenizer(in.readLine());
			boolean bool = tk.nextToken().equals("1") ? true : false ;
			if(bool)
			{
				n += 1;
				int x = Integer.parseInt(tk.nextToken());
				bool = tk.nextToken().equals("0") ? true : false;
				if(bool)
				{
					ArrayList<Integer> al = new ArrayList<>();
					hm.put(n,al);
					hm.get(x).add(n);
				}
				else
				{
					ArrayList<Integer> al = new ArrayList<>();
					al.add(x);
					hm.put(n,al);
				}
				//Solution.display(hm);
			}
			else
			{
				int u = Integer.parseInt(tk.nextToken());
				int v = Integer.parseInt(tk.nextToken());
				if(u==v)
					System.out.println("Yes");
				else if(Solution.fun(hm,u,v))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
	public static boolean fun(HashMap<Integer,ArrayList<Integer>> hm, int u , int v)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		if(hm.get(u)==null)
			return false;
		al.addAll(hm.get(u));
		boolean val=false;
		if(al.size()==0)
		{
			return false;
		}
		else
		{
			if(al.contains(v))
				return true;
			else
			{
				HashMap<Integer,ArrayList<Integer>> hm2 = new HashMap<>();
				hm2.putAll(hm);
				//Solution.display(hm2);
				hm2.remove(u);
				//Solution.display(hm2);
				if(hm2.size()==0)
					return false;
				for(Integer k : al)
				{
					//System.out.println("K value here :"+k);
					return Solution.fun(hm2,k,v);
				}
			}
		}
		return val;
	}
}