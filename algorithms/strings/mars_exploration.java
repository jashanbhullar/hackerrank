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
		int res = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(i%3 == 0 || i%3 == 2)
			{
				if(ch != 'S')
					res++;
			}
			else if(i%3 == 1)
			{
				if(ch != 'O')
					res++;
			}
		}
		System.out.println(res);
	}
}