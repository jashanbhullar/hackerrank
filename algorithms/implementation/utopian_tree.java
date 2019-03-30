import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)
		{
			int c = Integer.parseInt(in.readLine());
			int height=1;
			for(int j=1;j<=c;j++)
			{
				height = (j%2==0) ? height+1 : height*2 ; 
			}
			System.out.println(height);
		}
	}
}