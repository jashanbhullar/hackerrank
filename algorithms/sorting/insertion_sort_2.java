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
		for(int i=1;i<n;i++)
		{
			int j = i-1;
			while(j>=0 && arr[j]>arr[i])
				j--;
			Solution.shift(arr,j,i);
			Solution.display(arr);
		}
	}
	public static void display(int [] arr)
	{
		for(int ob : arr)
			System.out.print(ob+" ");
		System.out.println();
	}
	public static void shift(int [] arr,int j,int i)
	{
		int val = arr[i];
		for(int k=i;k>j+1;k--)
		{
			arr[k] = arr[k-1];
		}
		arr[j+1] = val; 
	}
}