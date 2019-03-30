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
		int [] arr = new int[100];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			int val = Integer.parseInt(tk.nextToken());
			arr[val]++;
		}
		for(int i=0;i<100;i++)
		{
			while(arr[i] != 0)
			{
				System.out.print(i+" ");
				arr[i]--;
			}
		}
	}
}