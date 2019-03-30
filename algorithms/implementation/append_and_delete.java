import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str1 = in.readLine();
		String str2 = in.readLine();
		int op = Integer.parseInt(in.readLine());
		if(op>=(str1.length()+str2.length()))
		{
			System.out.println("Yes");
			System.exit(0);
		}
		boolean flag = false;
		if(str1.length()>str2.length())
		{
			op -= str1.length()-str2.length();
			//System.out.println("1  :"+op);
			flag = true;
		}
		int index = -1;
		boolean flag2=false;
		int n = Math.min(str1.length(),str2.length());
		for(int i=0;i<n;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				index = i ;
				//System.out.println("Match : "+index);
				flag2=true;
				break;
			}
		}
		if(flag2)
		{
			if(flag)
			{
				op -= 2*(str2.length()-index);
			}
			else
			{
				op -= 2*(str1.length()-index);
			}
		}
		
		//System.out.println("2  :"+op);
		if(str2.length()>str1.length())
		{
			op -= str2.length()-str1.length();
			//System.out.println("3  :"+op);
		}
		if(op%2==0 && op>=0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}