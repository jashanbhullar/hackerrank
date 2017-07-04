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
		int n = Integer.parseInt(in.readLine());
		String str = in.readLine();
		Pattern pt = Pattern.compile("(010)");
		Matcher mt = pt.matcher(str);
		int res = 0;
		while(mt.find())
			res++ ;
		System.out.println(res);
	}
}