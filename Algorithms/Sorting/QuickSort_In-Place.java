import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	static int [] ar ;
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ar = new int[n];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
			ar[i] = Integer.parseInt(tk.nextToken());
		Solution.quickSort(0,n-1);
	}
	static void quickSort(int start, int end)
	{
		if(start >= end)
			return;
		int a = start;
		int pivot = ar[end];
		int i = start;
		while(start < end)
		{
			//System.out.println(i);
			int val = ar[start];
			if(val < pivot)
			{
				ar[start] = ar[i];
				ar[i] = val;
				i++;
			}
			start++;
		}
		ar[end] = ar[i];
		ar[i] = pivot;
		Solution.display();
		Solution.quickSort(a,i-1);
		Solution.quickSort(i+1,end);
	}
	static void display()
	{
		for(int ob : ar)
			System.out.print(ob+" ");
		System.out.println();
	}
}