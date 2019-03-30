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
		int [] arr = new int[26];
		for(int i=0;i<str.length();i++)
		{
			int val = str.charAt(i)-97;
			arr[val]++;
		}
		int res = 0;
		for(int i=0;i<26;i++)
		{
			if(arr[i]%2 != 0)
				res++;
		}
		if(res>1)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}