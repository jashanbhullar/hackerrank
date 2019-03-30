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
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int [] arr = new int[n];
			boolean flag = true;
			int sum = 0;
			for(int i=0;i<n;i++)
			{
				int val = Integer.parseInt(tk.nextToken());
				arr[i] = val;
				if(val > 0)
				{
					flag = false;
					sum += val;
				}
			}
			if(flag)
			{
				sum = arr[0];
				for(int i=1;i<n;i++)
					sum = Math.max(sum,arr[i]);
				System.out.println(sum+" "+sum);
			}
			else
			{
				int max = arr[0];
				int max_S = arr[0];
				for(int i=1;i<n;i++)
				{
					int x = arr[i];
					max = Math.max(x,max+x);
					max_S = Math.max(max,max_S);
				}
				System.out.println(max_S+" "+sum);
			}
		}
	}
}