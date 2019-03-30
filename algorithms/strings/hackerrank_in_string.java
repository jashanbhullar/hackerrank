import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char [] arr = {'h','a','c','k','e','r','r','a','n','k'};
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			String str = in.readLine();
			int index  = 0;
			for(int i=0;i<str.length();i++)
			{
				try
				{
					//System.out.println(str.charAt(i)+"  "+arr[index]);
					if(str.charAt(i) == arr[index])
						index++;

				}catch(IndexOutOfBoundsException e)
				{
					break;
				}
			}
			if(index == 10)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
}