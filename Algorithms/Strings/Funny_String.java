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
			boolean flag = true;
			for(int i=0;i<str.length()-1;i++)
			{
				int j = str.length() - 1 - i;
				int x = Math.abs((int)str.charAt(i)-(int)str.charAt(i+1));
				int y = Math.abs((int)str.charAt(j)-(int)str.charAt(j-1));
				if(x != y)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}
	}
}