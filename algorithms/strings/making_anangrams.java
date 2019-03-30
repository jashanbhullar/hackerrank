import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int [] a1 = Solution.fun(in.readLine());
		int [] a2 = Solution.fun(in.readLine());

		int res = 0;
		for(int i=0;i<26;i++)
		{
			res += Math.abs(a1[i]-a2[i]);
		}
		System.out.println(res);

	}
	static int[] fun(String str)
	{
		int [] arr = new int[26];
		for(int i=0;i<str.length();i++)
		{
			int ch = str.charAt(i)-97;
			arr[ch]++;
		}
		return arr;	
	}
}