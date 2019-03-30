import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int t = Integer.parseInt(tk.nextToken());
		int [] arr = new int[n];
		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(tk.nextToken());
		for(int i=0;i<t;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			int val = 4;
			for(int j=a;j<=b;j++)
			{
				val = Math.min(val,arr[j]);
				if(val == 1)
					break;
			}
			System.out.println(val);
		}
	}
}