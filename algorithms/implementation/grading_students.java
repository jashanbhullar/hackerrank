import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)
		{
			int grade = Integer.parseInt(in.readLine());
			if(grade>=38)
			{
				if(grade%5 >= 3)
				{
					grade=grade+5-grade%5;
				}
			}
			System.out.println(grade);
		}
	}
}