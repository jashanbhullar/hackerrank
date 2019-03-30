import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int  t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++)
		{
			String str = in.readLine();
			int num = Integer.parseInt(str);
			int res = 0;
			for(int j=0;j<str.length();j++)
			{
				int val = Integer.parseInt(str.substring(j,j+1));
				if(val!=0)
				{
					if(num%val==0)
						res++;						
				}
			}
			System.out.println(res);
		}
	}
}