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
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int k = Integer.parseInt(tk.nextToken());
		int b = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		int sum=0;
		for(int i=0;i<=str.length()-k;i++)
		{
			String sub = str.substring(i,i+k);
			int num=0;
			for(int j=0;j<sub.length();j++)
			{
				int val = Character.getNumericValue(sub.charAt(j));
				int fac = (int)Math.pow((double)b,(double)sub.length()-j-1);
				num += val*fac;
			}
			sum += num%m;
		}
		System.out.println(sum);
	}
}