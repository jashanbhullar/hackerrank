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
			int m = Integer.parseInt(in.readLine());
			int n = Integer.parseInt(in.readLine());
			int [] arr = new int[n];
			StringTokenizer tk = new StringTokenizer(in.readLine());
			for(int i=0;i<n;i++)
				arr[i] = Integer.parseInt(tk.nextToken());
			boolean flag = false;
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]+arr[j] == m)
					{
						i++;
						j++;
						System.out.println(i+" "+j);
						flag = true;
					}
				}
				if(flag)
					break;
			}
		}
		
	}
}