import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(in.readLine());
		int m = Integer.parseInt(in.readLine());
		String [] arr = {"","one","two","three","four","five","six","seven","eight","nine","ten",
		"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eigtheen","nineteen","twenty"};
		if(m==0)
			System.out.println(arr[h]+" o'clock");
		else if(m<30)
		{
			if(m==15)
				System.out.println("quarter past "+arr[h]);
			else if(m>20)
			{
				String str = arr[20]+" "+arr[m-20];
				System.out.println(str+" minutes past "+arr[h]);
			}
			else
				System.out.println(arr[m]+" minutes past "+arr[h]);
		}
		else if(m>30)
		{
			h++;
			m = 60 - m;
			if(m==15)
				System.out.println("quarter to "+arr[h]);
			else if(m>20)
			{
				String str = arr[20]+" "+arr[m-20];
				System.out.println(str+" minutes to "+arr[h]);
			}
			else
				System.out.println(arr[m]+" minutes to "+arr[h]);
		}
		else
			System.out.println("half past "+arr[h]);
	}
}