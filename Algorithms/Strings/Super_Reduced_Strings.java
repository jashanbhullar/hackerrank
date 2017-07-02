import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		String res = str;
		while(true)
		{
			res = str.replaceAll("([a-z])\\1","");
			if(res.equals(str))
				break;
			str = res;
		}
		if(res.length() == 0)
			System.out.println("Empty String");
		else
			System.out.println(res);
	}
}