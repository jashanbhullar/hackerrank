import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	static int n;
	static int m;
	static char[][] ar;
	static boolean flag;
	static int res = 0;
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			n = Integer.parseInt(tk.nextToken());
			m = Integer.parseInt(tk.nextToken());
			ar = new char[n][m];
			res = 0;
			int x=0,y=0;
			for(int i=0;i<n;i++)
			{
				String str = in.readLine();
				for(int j=0;j<m;j++)
				{
					ar[i][j] = str.charAt(j);
					if (ar[i][j] == 'M')
					{
						x = i;
						y = j;
					}
				}
			}
			fun(x,y);
			System.out.println(res);
			String ans = res == Integer.parseInt(in.readLine()) ? "Impressed" : "Oops!";
			System.out.println(ans);
		}
	}
	public static void fun(int x, int y)
	{
		int path = 0;
		if(flag)
			return ;
		// up
		if( (x-1) >=0 )
		{
			if(ar[x-1][y] == '.')
			{
				ar[x][y] = 'X';
				path++;
				fun(x-1,y);
			}
			else if(ar[x-1][y] == '*')
			{
				flag = true;
				path++;
			}
		}
		//down
		if( (x+1) < n )
		{
			if(ar[x+1][y] == '.')
			{
				ar[x][y] = 'X';
				path++;
				fun(x+1,y);
			}
			else if(ar[x+1][y] == '*')
			{
				flag = true;
				path++;
			}
		} 
		// left
		if( (y-1) >= 0 )
		{
			if(ar[x][y-1] == '.')
			{
				ar[x][y] = 'X';
				path++;
				fun(x,y-1);
			}
			else if(ar[x][y-1] == '*')
			{
				flag = true;
				path++;
			}
		}
		//right
		if( (y+1) < m )
		{
			if(ar[x][y+1] == '.')
			{
				ar[x][y] = 'X';
				path++;
				fun(x,y+1);
			}
			else if(ar[x][y+1] == '*')
			{
				flag = true;
				path++;
			}
		}
		if(path > 1)
			res++;
	}
	public static void display()
	{
		for(char [] ob : ar)
		{
			for(char ch : ob)
				System.out.print(ch+" ");
			System.out.println();
		}
	}
}