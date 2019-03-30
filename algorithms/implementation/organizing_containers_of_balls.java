import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++)
		{
			int n = Integer.parseInt(in.readLine());
			int [] ball = new int[n];
			int [] cont = new int[n];
			for(int j=0;j<n;j++)
			{
				int sum = 0;
				StringTokenizer tk = new StringTokenizer(in.readLine());
				for(int k=0;k<n;k++)
				{
					int val = Integer.parseInt(tk.nextToken());
					ball[k] += val;
					sum += val;
				}
				cont[j] = sum;
			}
			Arrays.sort(ball);
			Arrays.sort(cont);
			boolean flag = Arrays.equals(ball,cont);
			if(flag)
				System.out.println("Possible");
			else
				System.out.println("Impossible");
		}
	}
}