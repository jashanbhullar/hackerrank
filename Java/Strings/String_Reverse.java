import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution 
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}