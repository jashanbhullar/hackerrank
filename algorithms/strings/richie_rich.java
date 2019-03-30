import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Solution
{
	static int n;
	static int k;
	static TreeSet<Integer> ts = new TreeSet<>();
	static StringBuilder str;
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		n = Integer.parseInt(tk.nextToken());
		k = Integer.parseInt(tk.nextToken());
		str = new StringBuilder(in.readLine());
		if(k >= n)
		{
			for(int i=0;i<n;i++)
				System.out.print("9");
			System.out.println();
			System.exit(0);
		}
		for(int i=0;i<n/2;i++)
		{	
			char a = str.charAt(i);
			char b = str.charAt(n-1-i);
			if(a != b)
				ts.add(i);
		}
		//System.out.println(ts);
		if( ts.size() > k)
		{
			System.out.println("-1");
			System.exit(0);
		}
		else if( ts.size() == k)
		{
			Solution.fun();
			System.out.println(str);
		}
		else
		{
			int ext = k - ts.size();
			Solution.fun(ext);
			Solution.fun();
			System.out.println(str);
		}
	}
	static void fun()
	{
		for(int i : ts)
		{
			char a = str.charAt(i);
			char b = str.charAt(n-1-i);
			char set = a>b ? a : b;
			str.setCharAt(i,set);
			str.setCharAt(n-1-i,set);
		}
	}
	static void fun(int ext)
	{
		int x = 0;
		while(x<n && ext != 0)
		{
			if(ext == 1)
			{
				boolean flag = true;
				for(int i : ts)
				{
					char a = str.charAt(i);
					char b = str.charAt(n-1-i);
					char set = a>b ? a : b;
					if(set !='9')
					{
						flag = false;
						str.setCharAt(i,'9');
						str.setCharAt(n-1-i,'9');
						break;
					}
				}
				if( flag && n%2 == 1 )
				{
					int i = n/2;
					str.setCharAt(i,'9');
				}
			}
			else
			{
				char a = str.charAt(x);
				char b = str.charAt(n-1-x);
				if(a != b)
				{
					if( a == '9' || b == '9' )
					{
						str.setCharAt(x,'9');
						str.setCharAt(n-1-x,'9');
						ts.pollFirst();
						ext++;
					}
					else
					{
						str.setCharAt(x,'9');
						str.setCharAt(n-1-x,'9');
						ts.pollFirst();
					}
				}
				else
				{
					if( a != '9' )
					{
						str.setCharAt(x,'9');
						str.setCharAt(n-1-x,'9');
						ext--;
					}
					else
						ext++;	
				}
			}
			ext--;
			x++;
			//System.out.println(ext+"  "+str);
		}
	}
}