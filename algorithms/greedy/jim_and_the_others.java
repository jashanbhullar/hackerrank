import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.Arrays;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int [][] arr = new int[n][2];
		for(int i=0;i<n;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int val = Integer.parseInt(tk.nextToken()) + Integer.parseInt(tk.nextToken());
			arr[i][0] = val;
			arr[i][1] = i+1;
		}
		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] ob1, int[] ob2)
			{
				if(ob1[0] != ob2[0])
					return ob1[0] - ob2[0];

				return ob1[1] - ob2[1];
			}
		});
		for(int[] ob : arr)
			System.out.print(ob[1]+" ");
	}
}