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
		int [] arr = new int[n+1];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(tk.nextToken());
		}
		int i=0;
		int jumps=0;
		while(i<n-1)
		{
			if(arr[i+2]==1)
			{
				i++;
			}
			else
				i+=2;
			jumps++;
		}
		System.out.println(jumps);
	}
}