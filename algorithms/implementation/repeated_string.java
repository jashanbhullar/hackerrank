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
		long n = Long.parseLong(in.readLine());
		long a =0;
		for(int i=0;i<str.length();i++)
		{	
			if(str.charAt(i)=='a')
				a++;
		}
		long c =n/(long)str.length();
		a *= c;
		c = n%(long)str.length();
		for(int i=0;i<(int)c;i++)
		{
			if(str.charAt(i)=='a')
				a++;
		}
		System.out.println(a);
	}
}