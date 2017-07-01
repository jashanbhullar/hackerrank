import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Long a = Long.parseLong(in.readLine());
		Long b = 0L;
		Long c = 0L;
		if(a%2 != 0)
		{
			b = (a*a - 1)/2;
			c = b + 1;
		}
		else
		{
			b = (a/2)*(a/2) - 1;
			c = b + 2;
		}
		System.out.println(a+" "+b+" "+c);
	}
}