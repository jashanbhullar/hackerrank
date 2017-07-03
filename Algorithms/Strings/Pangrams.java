import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine().replaceAll(" ","").toLowerCase();
		HashSet<Character> hs = new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
			if(hs.size() == 26)
			{
				//System.out.println(hs);
				System.out.println("pangram");
				System.exit(0);
			}
		}
		System.out.println("not pangram");
	}
}