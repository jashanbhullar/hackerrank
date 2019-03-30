import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		String str = in.readLine();
		int step = 0;
		int res = 0;
		boolean bool = false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='U')
				step++;
			else
				step--;
			if(step>0)
				bool = false;
			else if(step<0)
				bool = true;
			if(step==0 && bool)
				res++;
		}
		System.out.println(res);
	}
}