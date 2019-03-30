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
		BigInteger exp = new BigInteger("3");
		exp = exp.pow(n);
		BigInteger res = new BigInteger("3");
		res = res.modPow(exp,new BigInteger("1000000007"));
		System.out.println(res);
	}
}