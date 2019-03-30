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
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			String [] str = new String[a];
			for(int i=0;i<a;i++)
				str[i] = in.readLine();

			tk = new StringTokenizer(in.readLine());
			int x = Integer.parseInt(tk.nextToken());
			int y = Integer.parseInt(tk.nextToken());
			String [] res = new String[x];
			for(int i=0;i<x;i++)
				res[i] = in.readLine();
			
			// Checking part
			int index = 0;
			String first = res[0];
			boolean flag  = false;
			for(int i=0;i<a;i++)
			{
				index = str[i].indexOf(first);
				while(index != -1)
				{
					index =  str[i].indexOf(first,index);
					if(index == -1)
						break;
					if(Solution.fun(str,res,i,index))
					{
						flag = true;
						break;
					}
					index++;
				}
				if(flag)
					break;
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	static boolean fun(String[] str, String[] res, int r,int c)
	{
		int j=r+1;
		int index = 0;
		for(int i=1;i<res.length;i++)
		{
			if(j>=str.length)
				return false;
			index = str[j].indexOf(res[i],c);
			if(index != c)
				return false;
			j++;
		}
		return true;
	}
}