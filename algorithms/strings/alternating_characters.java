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
		int test = Integer.parseInt(in.readLine());
		Pattern pt = Pattern.compile("([A-Z])(\\1)+");
		for(int t=0 ; t<test ; t++)
		{
			String str = in.readLine();
			Matcher mt = pt.matcher(str);
			int res = 0;
			while(mt.find())
			{
				//System.out.println(mt.group(0));
				res = res + mt.group(0).length() - 1;
			}
			System.out.println(res);
		}
	}
}