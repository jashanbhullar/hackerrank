import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(in.readLine());
		String str = Long.toBinaryString(n);
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '0')
				count++;
		}
		if(n == 0)
			count = 0;
		long res = (long) Math.pow(2,count);
		System.out.println(res);
	}
}