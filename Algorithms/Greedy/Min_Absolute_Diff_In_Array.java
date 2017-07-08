import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int [] arr = new int[n];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			int val = Integer.parseInt(tk.nextToken());
			int j = i - 1; 
			while(j>=0 && val<arr[j] )
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val;
		}
		int sum = Integer.MAX_VALUE;
		for(int i=1;i<n;i++)
		{
			int val = Math.abs(arr[i]-arr[i-1]);
			sum = Math.min(sum,val);
			if(sum == 0)
				break;
		}
		System.out.println(sum);
	}
}