import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String str = in.readLine();
		int k = Integer.parseInt(in.readLine());
		k = k%26;
		String res = "";
		for(int i=0;i<n;i++)
		{
			int val = (int)str.charAt(i);
			if(val > 64 && val < 91 )
			{
				val += k;
				if(val > 90)
					val -= 26;

			}
			else if(val > 96 && val < 123)
			{
				val += k;
				if(val > 122)
					val -= 26;
			}
			res += (char)val;
		}
		System.out.println(res);
	}
}