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
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(tk.nextToken());
		Arrays.sort(arr);
		for(int i=n-1;i>1;i--)
		{
			int a = arr[i];
			for(int j=i-1;j>0;j--)
			{
				int b = arr[j];
				for(int k=j-1;k>=0;k--)
				{
					int c = arr[k];
					if( (b + c) > a)
					{
						System.out.println(c+" "+b+" "+a);
						System.exit(0);
					}
				}
			}
		}
		System.out.println("-1");
	}
}