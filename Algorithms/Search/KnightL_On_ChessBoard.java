import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	static int m;
	static int val = Integer.MAX_VALUE;
	static int a,b;
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		m = n - 1;
		for(int i=1;i<n;i++)
		{
			a = i;
			for(int j=1;j<n;j++)
			{
				b = j;
				int ans = Solution.fun(0,0,0);
				if( ans == val)
					System.out.println("-1 ");
				else
					System.out.println(ans+" ");
			}
			System.out.println();
		}
	}
	public static int fun(int x,int y,int step)
	{
		if(x == m && y == m)
			return step;
		else if(x > m || y > m || x < 0 || y < 0)
			return val;
		step++;
		int [] ar = new int[8];
		ar[0] = Solution.fun(x-a,y-b,step);
		ar[1] = Solution.fun(x-b,y-a,step);
		ar[2] = Solution.fun(x+a,y-b,step);
		ar[3] = Solution.fun(x+b,y-a,step);
		ar[4] = Solution.fun(x+a,y+b,step);
		ar[5] = Solution.fun(x+b,y+a,step);
		ar[6] = Solution.fun(x-a,y+b,step);
		ar[7] = Solution.fun(x-b,y+a,step);
		int min = val;
		for(int i=0;i<8;i++)
			min = Math.min(min,ar[i]);
		return min;
	}
}