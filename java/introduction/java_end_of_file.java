import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution 
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int count=1;
		while((str=in.readLine())!=null)
		{
			System.out.println(count+" "+str);
			count++;
		}
	}
}