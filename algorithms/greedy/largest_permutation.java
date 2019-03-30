import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


class Solution
{
	public static void main (String ... ags )throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		int [] arr = new int[n];
		int [] index = new int[n+1];
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(tk.nextToken());
			index[arr[i]] = i;
		}
		for(int i=0;i<n && k>0;i++)
		{
			if(arr[i] == n - i)
				continue;
			arr[index[n-i]] = arr[i];
			index[arr[i]] = index[n - i];
			arr[i] = n - i;
			index[n -i] = i;
			k--;
		}
		for(int ob : arr)
			System.out.print(ob+" ");
	}
}