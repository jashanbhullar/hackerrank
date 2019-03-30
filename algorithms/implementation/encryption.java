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
		int r = (int)Math.sqrt(str.length());
		int c = 0;
		if(r*r == str.length())
			c = r;
		else if(r*(r+1) >= str.length())
			c = r + 1;
		else
		{
			r = r+1;
			c = r;
		}
		//System.out.println(r+ " "+c);
		int x = 0;
		for(int i=0;i<c;i++)
		{
			x = i;
			while(x<=str.length())
			{
				try
				{
					System.out.print(str.charAt(x));
					x += c;
				}
				catch(Exception e)
				{
					break;
				}
			}
			System.out.print(" ");
		}
	}
}