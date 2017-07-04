import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			String str = in.readLine();
			String res = "";
			for(int i=0;i<str.length();i++)
			{
				String ch = str.substring(i,i+1);
				if(!res.contains(ch))
					res += ch;
			}
			System.out.println(res.length());
		}
	}
}