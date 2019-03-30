import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));		
		int n = Integer.parseInt(in.readLine()); 										
		int sum = 0;							
		for(int i=0;i<n;i++)
		{
			String [] str = in.readLine().split(" ");							
			int a = Integer.parseInt(str[i]);											
			int b = Integer.parseInt(str[n-i-1]);										
			sum = sum+a-b;
		}
		System.out.println(Math.abs(sum));
	}
}