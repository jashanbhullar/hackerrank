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
		int [][] arr = new int[6][1];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		while(tk.hasMoreTokens())
		{
			int val = Integer.parseInt(tk.nextToken());
			arr[val][0]++;
		}
		int max =0;
		int maxi=0;
		for(int i=1;i<6;i++)
		{
			if(arr[i][0]>max)
			{
				max=arr[i][0];
				maxi=i;			}
		}
		System.out.println(maxi);
	}
}