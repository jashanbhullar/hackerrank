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
			if(str.length()%2 != 0)
			{
				System.out.println("-1");
			}
			else
			{
				String str1 = str.substring(0,str.length()/2);
				String str2 = str.substring(str.length()/2,str.length());
				int [] a1 = new int[26];
				int [] a2 = new int[26];
				for(int i=0;i<str1.length();i++)
				{
					int c1 = (int)str1.charAt(i)-97;
					int c2 = (int)str2.charAt(i)-97;
					a1[c1]++;
					a2[c2]++;
				}
				int res = 0;
				for(int i=0;i<26;i++)
				{
					res += Math.abs(a1[i]-a2[i]);
				}
				res = res/2;
				System.out.println(res);
			}
		}
		
	}
}