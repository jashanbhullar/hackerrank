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
		BigInteger a = new BigInteger(in.readLine());
		BigInteger b = new BigInteger(in.readLine());
		System.out.println(a.add(b).toString());
		System.out.println(a.multiply(b).toString());
	}
}