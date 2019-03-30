import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution 
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str=in.readLine();
		int n=Integer.parseInt(in.readLine());
		String small=str.substring(0,n);
		String large=str.substring(0,n);
		for(int i=0;i<=str.length()-n;i++)
		{
			String curr = str.substring(i,i+n);
			if(small.compareTo(curr)>0)
			{
				small=curr;
			}
			if(large.compareTo(curr)<0)
			{
				large=curr;
			}
		}
		System.out.println(small+"\n"+large);
	}
}