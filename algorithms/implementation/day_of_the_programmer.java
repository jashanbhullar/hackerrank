import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(in.readLine());
		if(year>1918)
		{
			if(year%4==0)
			{
				if(year%100==0 && year%400!=0)
					System.out.println("13.09."+year);
				else
					System.out.println("12.09."+year);
			}
			else
				System.out.println("13.09."+year);
		}
		else if(year<1918)
		{
			if(year%4==0)
				System.out.println("12.09."+year);
			else
				System.out.println("13.09."+year);
		}
		else
			System.out.println("26.09."+year);
	}
}