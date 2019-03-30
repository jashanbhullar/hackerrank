import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		if(n%2==0)
			n += 1;
		int m = Integer.parseInt(in.readLine());
		if(m%2==0)
			m += 1;
		int val = Math.min(m-1,n-m);
		val = val/2;
		System.out.println(val);
	}
}