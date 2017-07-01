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
			int m = Integer.parseInt(tk.nextToken());
			int s = Integer.parseInt(tk.nextToken());
			if(m/n!=0)
				m -= (m/n)*n;
			int res = s + m -1 ;
			if(res>n)
				res -= n ;
			if(res==0)
				res = n;
			System.out.println(res);
		}
	}
}