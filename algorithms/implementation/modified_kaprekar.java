import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(in.readLine());
		int q = Integer.parseInt(in.readLine());
		int [] arr = {1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999};
		boolean bool = true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=p && arr[i]<=q)
			{
				System.out.print(arr[i]+" ");
				bool = false;
			}
		}
		if(bool)
			System.out.println("INVALID RANGE");
	}
}