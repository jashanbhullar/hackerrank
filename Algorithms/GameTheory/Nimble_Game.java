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
			for(int i=0;i<n;i++)
				arr[i] = Integer.parseInt(tk.nextToken());
			String ans = Solution.fun(arr) ? "First" : "Second";
			System.out.println(ans);
		}
	}
	public static boolean fun(int [] arr)
	{
		int total = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 1)
				total ^= i;
		}
		return total != 0;
	}
}