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
		//long x = 1 ;
		long y = 3 ;
		long i = 0;
		while(y<n)
		{
			//System.out.println(x+"  "+y+"  "+i);
			long fac = y/3;
			//x = y+1;
			fac = (fac*2) + 1;
			y = 3 * fac;
			i++;
		}
		//System.out.println(y);
		y = y - n;
		y ++;
		System.out.println(y);
	}
}