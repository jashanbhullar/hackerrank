import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;

class Index
{
	ArrayList<Integer> al = new ArrayList<>();
	Index(int a,int b)
	{
		al.add(a);
		al.add(b);
	}
	public int getVal()
	{
		int res = 0;
		for(int i=1;i<al.size();i+=2)
			res += al.get(i) - al.get(i-1) + 1;
		return res;
	}
	public void setVal(int a,int b)
	{
		//System.out.println("Initially :"+al);
		int index  = al.size();
		for(int i=1;i<al.size();i+=2)
		{
			int x = al.get(i-1);
			int y = al.get(i);
			//System.out.println(x+ " = x and y = "+y);
			if(a >= x && a <= y )
			{
				//System.out.println("x is in between "+al);
				if( b <= y)
				{
					//System.out.println("Yay");
					return;
				}
				al.remove(i);
				index = i+1;
				break;
			}
			else if(a < x)
			{
				al.add(i-1,a);
				//System.out.println("x is not in between "+al);
				index = i+1;
				break;
			}
		}
		if( index == al.size() )
		{
			al.add(a);
			al.add(b);
			//System.out.println(" al.size() "+al);
			return;
		}
		while( index < al.size())
		{
			int x = al.get(index-1);
			int y = al.get(index);
			//System.out.println(x+ " while "+y);
			if( b < x )
			{
				al.add(index-1,b);
				//System.out.println(al);
				return;
			}
			else if( b >= x && b <= y)
			{
				al.remove(index-1);
				//System.out.println(al);
				return;
			}
			al.remove(index);
			al.remove(index-1);
			//System.out.println(x+ " removed "+y);
		}
		al.add(b);
		//System.out.println(al);
		return;
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
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			try
			{
				Index temp = hm.get(r);
				temp.setVal(a,b);
				hm.put(r,temp);
			}
			catch(NullPointerException e)
			{
				hm.put(r,new Index(a,b));
			}
		}
		for(Index ob : hm.values())
			res -= ob.getVal();
		System.out.println(res);
	}
}