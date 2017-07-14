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
		int n = Integer.parseInt(in.readLine());
		int [] a = new int[n];
		int [] b = new int[n];
		StringTokenizer tka = new StringTokenizer(in.readLine());
		StringTokenizer tkb = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(tka.nextToken());
			b[i] = Integer.parseInt(tkb.nextToken());
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int count = 0;
		int j = 0;
		for(int i=0;i<n;i++)
		{
			int val = a[i];
			while( j < n && b[j] <= val)
			{
				if(val == b[j])
				{
					count++;
					j++;
					break;
				}
				j++;
			}
		}
		if(count == n)
			count--;
		else
			count++;
		System.out.println(count);
	}
}