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
			int [] arr = new int[n];
			int total = 0;
			StringTokenizer tk = new StringTokenizer(in.readLine());
			for(int i=0;i<n;i++)
				arr[i] = Integer.parseInt(tk.nextToken());
			for(int i=0;i<n;i++)
			{
				int val = arr[i];
				for(int j=i+1;j<n;j++)
				{
					if(val>arr[j])
						total++;
				}
			}
			String res = (total%2 == 0) ? "YES" : "NO";
			System.out.println(res);
		}
	}
}