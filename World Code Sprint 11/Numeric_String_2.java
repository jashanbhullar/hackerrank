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
		long k = Long.parseLong(tk.nextToken());
		long b = Long.parseLong(tk.nextToken());
		long m = Long.parseLong(tk.nextToken());
		long sum=0;
		String sub = str.substring(0,(int)k);
		long num=0;
		long first=(long)Character.getNumericValue(str.charAt(0))*(long)Math.pow((double)b,(double)k-1);
		long last=0;
		for(int i=0;i<sub.length();i++)
		{
			long val = (long)Character.getNumericValue(sub.charAt(i));
			long fac = (long)Math.pow((double)b,(double)sub.length()-i-1);
			num += val*fac;
		}
		sum += num%m;
		for(int i=1;i<=str.length()-(int)k;i++)
		{
			num -= first;
			num = num*b;
			last = (long)Character.getNumericValue(str.charAt(i+(int)k-1));
			first = (long)Character.getNumericValue(str.charAt(i))*(long)Math.pow((double)b,(double)k-1);
			num += last;
			sum += num%m;
		}
		System.out.format("%d",sum);
	}
}