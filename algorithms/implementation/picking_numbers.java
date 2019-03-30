import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int [] arr = new int[101];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		while(tk.hasMoreTokens())
		{
			int val = Integer.parseInt(tk.nextToken());
			arr[val]++;
			arr[val+1]++;
		}
		Arrays.sort(arr);
		System.out.println(arr[100]);
	}
}