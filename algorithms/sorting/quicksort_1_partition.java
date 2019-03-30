import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
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
		int p = arr[0];
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		for(int i=1;i<n;i++)
		{
			int val = arr[i];
			if(val>p)
				right.add(val);
			else
				left.add(val);
		}
		left.add(p);
		Solution.display(left);
		Solution.display(right);
	}
	public static void display(ArrayList<Integer> al)
	{
		for(int ob : al)
			System.out.print(ob+" ");
	}
}