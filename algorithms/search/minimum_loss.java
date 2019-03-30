import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Long,Integer> hm = new HashMap<>();
		int n = Integer.parseInt(in.readLine());
		long [] ar = new long[n];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			ar[i] = Long.parseLong(tk.nextToken());
			hm.put(ar[i],i);
		}
		Arrays.sort(ar);
		Long min = Long.MAX_VALUE;
		for(int i=1;i<n;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				//System.out.println(ar[i]+" LOOP "+ar[j]);
				long val = ar[i] - ar[j];
				if(hm.get(ar[j]) > hm.get(ar[i]))
				{ 
					if( val < min)
						min = val;
					else
					{
						//System.out.println(ar[i] + " break");
						break;
					}
				}
			}
			if(min == 1)
				break;
		}
		System.out.println(min);
	}
}