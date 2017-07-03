import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		Pattern pt = Pattern.compile("([a-z])(\\1)*");
		Matcher mt = pt.matcher(str);
		while(mt.find())
		{
			System.out.println(mt.group(0));
		}
	}
}