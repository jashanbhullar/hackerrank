import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.math.BigInteger;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			long n = Long.parseLong(in.readLine());
			String str = Long.toBinaryString(n);
			while(str.length() != 32)
				str = "0"+str;
			long res = 0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) == '0')
					res += (long) Math.pow(2,str.length()-i-1);
			}
			System.out.println(res);
		}
	}
}