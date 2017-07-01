import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution 
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str1=in.readLine();
		String str2=in.readLine();
		int len=str1.length()+str2.length();
		int com=str1.compareTo(str2);
		System.out.println(len);
		if(com>0)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+" "+str2.substring(0,1).toUpperCase()+str2.substring(1));
	}
}