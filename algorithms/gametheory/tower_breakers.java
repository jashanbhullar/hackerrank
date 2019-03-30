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
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());
			if(m == 1 || n%2 == 0)
				System.out.println("2");
			else
				System.out.println("1");
		}
	}
}