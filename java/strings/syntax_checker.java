import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;

class Solution 
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)
		{
			try
			{
				Pattern.compile(in.readLine());
				System.out.println("Valid");
			}
			catch(PatternSyntaxException e)
			{
				System.out.println("Invalid");
			}
		}
	}
}