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
			int n = Integer.parseInt(in.readLine());
			int rem = n%3;
			if(n < 3)
			{
				System.out.print("-1");
			}
			else if(rem == 0)
			{
				for(int i=0;i<n;i++)
					System.out.print("5");
			}
			else if(rem == 1)
			{
				if(n<10)
				{
					System.out.print("-1");
				}
				else
				{
					int a = n/3;
					a -= 3;
					n = a*3;
					for(int i=0;i<n;i++)
						System.out.print("5");
					for(int i=0;i<10;i++)
						System.out.print("3");
				}
			}
			else
			{
				int a = n/3;
				a --;
				n = a*3;
				for(int i=0;i<n;i++)
					System.out.print("5");
				for(int i=0;i<5;i++)
					System.out.print("3");	
			}
			System.out.println();
		}
	}
}