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
			arr[i] = Integer.parseInt(tk.nextToken());
		int d = n+1;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<i+d;j++)
			{
				if(j>=n)
					break;
				if(arr[j] == arr[i])
					d = j - i;
			}
			
			if(d==1)
				break;
		}
		if(d!=n+1)
			System.out.println(d);
		else
			System.out.println("-1");

	}
}