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
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(tk.nextToken());
		int count = 0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(arr[i]>k)
				break;
			k -= arr[i];
			count++;
		}
		System.out.println(count);
	}
}