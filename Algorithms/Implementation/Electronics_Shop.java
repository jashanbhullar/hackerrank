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
		int s = Integer.parseInt(tk.nextToken());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());

		int [] a1 = new int[n];
		int [] a2 = new int[m];

		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
			a1[i]=Integer.parseInt(tk.nextToken());

		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<m;i++)
			a2[i]=Integer.parseInt(tk.nextToken());

		Arrays.sort(a1);
		Arrays.sort(a2);

		int val = a1[0]+a2[0];
		if(val>s)
		{
			System.out.println("-1");
		}
		else
		{
			int max=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					val = a1[i]+a2[j];
					if(val==s)
					{
						System.out.println(val);
						System.exit(0);
					}
					if(val>s)
						break;
					max = Math.max(max,val);
				}
			}
			System.out.println(max);
		}

	}
}