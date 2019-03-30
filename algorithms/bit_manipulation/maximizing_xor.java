import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(in.readLine());
		int r = Integer.parseInt(in.readLine());
		int xor = l^r;
		int bit = 32 - Integer.numberOfLeadingZeros(xor);
		int res = (1<<bit) - 1;
		System.out.println(res);
	}
}