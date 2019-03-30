import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		int res=0;
		for(int i=n;i<=m;i++)
		{
			if(Solution.fun(i,k))
				res++;
		}
		System.out.println(res);
	}
	static boolean fun(int num,int k)
	{
		String str = String.valueOf(num);
		StringBuilder stb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			stb.append(str.charAt(i));
		}
		int num2 = Integer.parseInt(stb.toString());
		num = Math.abs(num-num2);
		boolean bool = (num%k==0) ? true : false ;
		return bool;
	}
}