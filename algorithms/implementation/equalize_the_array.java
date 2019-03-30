import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int [] arr = new int[101];
		while(tk.hasMoreTokens())
			arr[Integer.parseInt(tk.nextToken())]++;
		int max=0;
		for(int i=0;i<101;i++)
			max = Math.max(max,arr[i]);
		max = n - max ;
		System.out.println(max);
	}
}