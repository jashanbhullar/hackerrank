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
			int x = Integer.parseInt(tk.nextToken());
			int y = Integer.parseInt(tk.nextToken());
			x = x%4;
			y = y%4;
			if(y==0 || y==3 || x==0 || x==3)
				System.out.println("First");
			else
				System.out.println("Second");
		}
	}
}