import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			in.readLine();
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int res = Integer.parseInt(tk.nextToken());
			while(tk.hasMoreTokens())
				res = res ^ Integer.parseInt(tk.nextToken());
			String ans = (res == 0) ? "First" : "Second";
			System.out.println(ans);
		}	
	}
}