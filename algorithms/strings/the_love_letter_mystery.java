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
		for(int t=0 ; t<test ; t++)
		{
			String str = in.readLine();
			int res = 0;
			for(int i=0;i<str.length()/2;i++)
			{
				char a = str.charAt(i);
				char b = str.charAt(str.length()-i-1);
				res += Math.abs((int)a-(int)b);
			}
			System.out.println(res);
		}
	}
}