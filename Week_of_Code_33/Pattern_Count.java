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
		for(int i=0;i<n;i++)
		{
			String str = in.readLine();
			str = str.replaceAll("1","11");
			String [] res = str.split("1(0+)1");
			System.out.println(res.length-1);
		}
	}
}