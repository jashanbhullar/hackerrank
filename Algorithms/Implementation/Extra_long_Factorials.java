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
		int n = Integer.parseInt(in.readLine());
		BigInteger num = new BigInteger("1");
		for(int i=2;i<=n;i++)
		{
			BigInteger num2 = BigInteger.valueOf((long)i);
			num = num.multiply(num2);
		}
		System.out.println(num.toString());
	}
}