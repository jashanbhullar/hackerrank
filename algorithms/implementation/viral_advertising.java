import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int res = 2;
		int val = 2;
		for(int i=1;i<n;i++)
		{
			res = (res*3)/2;
			val += res;
		}
		System.out.println(val);
	}
}