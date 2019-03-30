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
			int n = Integer.parseInt(in.readLine())-1;
			int a = Integer.parseInt(in.readLine());
			int b = Integer.parseInt(in.readLine());
			if(a>b)
			{
				int temp = a;
				a = b;
				b = temp;
			}
			if(a==b)
			{
				int val = a*(n);
				System.out.print(val);
			}
			else
			{
				for(int j=0;j<=n;j++)
				{
					int val = a*(n-j) + b*(j);
					System.out.print(val+" ");
				}
			}
			System.out.println();
		}
	}
}