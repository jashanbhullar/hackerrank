import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	static boolean [][] ar;
	static int n;
	static int m;
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		m = Integer.parseInt(in.readLine());
		ar = new boolean[n][m];
		for(int i=0;i<n;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			for(int j=0;j<m;j++)
				ar[i][j] = tk.nextToken().equals("1");
		}
		int ans = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if( ar[i][j] )
					ans = Math.max(ans,fun(i,j));
			}
		}
		System.out.println(ans);
	}
	public static int fun(int i,int j)
	{
		if( i < 0 || j < 0 || i >=n || j >= m || !ar[i][j])
			return 0;
		ar[i][j] = false;
		return 1 + fun(i-1,j) + fun(i+1,j) + fun(i,j-1) + fun(i,j+1) + fun(i+1,j+1) + fun(i-1,j-1) + fun(i+1,j-1) + fun(i-1,j+1);
	}
}