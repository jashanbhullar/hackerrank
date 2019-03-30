import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution 
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine(),"!,?._'@ ");
		System.out.println(tk.countTokens());
		while(tk.hasMoreTokens())
		{
			System.out.println(tk.nextToken());
		}
	}
}