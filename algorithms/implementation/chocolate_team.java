import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int c = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());
			int res = n/c;
			int wrap = res;
			while(wrap>=m)
			{
				int val = wrap/m;
				wrap -= val*m;
				wrap += val;
				res += val; 
			}
			System.out.println(res);
		}
	}
}