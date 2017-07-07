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
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(tk.nextToken());
		Arrays.sort(arr);

		int min = Integer.MAX_VALUE;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i<n;i++)
		{
			int val  = arr[i] - arr[i-1];
			//System.out.println(val);
			if(val<min)
			{
				min = val;
				al.clear();
				al.add(arr[i-1]);
				al.add(arr[i]);
			}
			else if(val == min)
			{
				al.add(arr[i-1]);
				al.add(arr[i]);
			}
		}
		for(int i : al)
			System.out.print(i+" ");
	}
}