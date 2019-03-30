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
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int left = 0;
			int right = 0;
			String res = "NO";
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(tk.nextToken());
				right += arr[i];
			}

			right -= arr[0];
			if(left == right)
				res = "YES";
			else
			{
				for(int i=1;i<n;i++)
				{
					left += arr[i-1];
					right -= arr[i];
					if(left == right)
					{
						res = "YES";
						break;
					}
				}
			}
			System.out.println(res);
		}
	}
}