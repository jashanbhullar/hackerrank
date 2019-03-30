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
		int val = arr[n-1];
		int i = n-2;
		while(i>=0 && arr[i]>=val)
		{
			arr[i+1] = arr[i];
			i--;
			Solution.display(arr);
		}
		arr[i+1] = val;
		Solution.display(arr);
	}
	public static void display(int [] arr)
	{
		for(int ob : arr)
			System.out.print(ob+" ");
		System.out.println();
	}
}