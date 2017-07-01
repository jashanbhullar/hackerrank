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
		int [][] arr = new int[n][n];
		for(int i=0;i<n;i++)
		{
			String str = in.readLine();
			for(int j=0;j<n;j++)
			{
				arr[i][j] = Integer.parseInt(str.substring(j,j+1));
				//System.out.print(arr[i][j]+" ");
			}
			//System.out.println();
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( i==0 || i == n-1 || j==0 || j ==n-1)
				{
					System.out.print(arr[i][j]);
				}
				else
				{
					int up = arr[i][j-1];
					int down = arr[i][j+1];
					int right = arr[i+1][j];
					int left = arr[i-1][j];
					int val = arr[i][j];
					if(val > up && val > down && val > right && val > left)
						System.out.print("X");
					else
						System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}