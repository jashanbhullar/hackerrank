import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int d = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		int [] ar = new int[n];
		ArrayList<Integer> md = new ArrayList<>();
		for(int i=0;i<d;i++)
		{
			ar[i] = Integer.parseInt(tk.nextToken());
			md.add(ar[i]);
		}
		int res = 0;
		for(int i=d;i<n;i++)
		{
			ar[i] = Integer.parseInt(tk.nextToken());
			int val = Solution.median(md);
			System.out.println(val);
			if(ar[i] >= val)
				res++;
			md.remove(0);
			md.add(ar[i]);
		}
		System.out.println(res);
	}
	public static int median(ArrayList<Integer> md)
	{
		Integer [] ar = new Integer[md.size()];
		ar = md.toArray(ar);
		Arrays.sort(ar);
		if(ar.length % 2 == 1)
		{
			return 2 * ar[ar.length/2];
		}
		int a = ar[ar.length / 2];
		int b = ar[(ar.length / 2)-1];
		return (a+b);
	}
}