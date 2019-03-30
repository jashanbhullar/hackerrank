import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			String str = in.readLine();
			int index = -1;
			for(int i=0;i<str.length()/2;i++)
			{	
				char a = str.charAt(i);
				char b = str.charAt(str.length()-1-i);
				if(a != b)
				{
					index = Solution.fun(str,i,str.length()-1-i) ? (str.length()-1-i) : i;
					break;
				}
			}
			System.out.println(index);
		}
	}
	static boolean fun(String str,int x,int y)
	{
		String sub = str.substring(x,y);
		for(int i=0;i<sub.length()/2;i++)
		{
			char a = sub.charAt(i);
			char b = sub.charAt(sub.length()-1-i);
			if(a != b)
				return false;
		}
		return true;
	}
}