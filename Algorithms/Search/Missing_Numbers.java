import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.TreeSet;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int [] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = Integer.parseInt(tk.nextToken());
		Arrays.sort(a);

		int m = Integer.parseInt(in.readLine());
		tk = new StringTokenizer(in.readLine());
		int [] b = new int[m];
		for(int i=0;i<m;i++)
			b[i] = Integer.parseInt(tk.nextToken());
		Arrays.sort(b);

		TreeSet<Integer> ts = new TreeSet<>();
		int j = 0;
		for(int i=0;i<m;i++)
		{
			try
			{
				while(b[i] != a[j])
				{
					ts.add(b[i]);
					i++;
				}
				j++;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				for( ;i<m;i++)
					ts.add(b[i]);
			}
		}
		for(int ob : ts)
			System.out.print(ob+" ");
	}
}