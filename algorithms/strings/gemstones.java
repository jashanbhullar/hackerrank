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
		String [] str = new String[n];
		for(int i=0 ; i<n ; i++ )
		{
			str[i] = in.readLine();
		}

		int res = 0;
		for(int i=97 ; i<123 ; i++)
		{
			boolean flag = true;
			char ch = (char)i;
			String cs = "";
			cs += ch;
			for(int j=0; j<n ; j++)
			{
				if(!str[j].contains(cs))
				{
					flag = false;
					break;
				}
			}
			if(flag)
				res++;
		}
		System.out.println(res);
	}
}