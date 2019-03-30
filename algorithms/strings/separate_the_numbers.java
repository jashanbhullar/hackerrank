import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++)
		{
			String str = in.readLine();
			boolean flag = true;
			for(int i=1;i<=str.length()/2;i++)
			{
				if(Solution.fun(str,i))
				{
					System.out.println("YES "+str.substring(0,i));
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("NO");
		}
	}
	static boolean fun(String str, int k)
	{
		long [] arr = new long[32];

		String sub = str.substring(0,k);
		if(sub.charAt(0) == '0')
			return false;
		arr[0] =  Long.parseLong(sub);
		int j=1;
		for(int i=k ; i<=str.length()-k ; i += k)
		{
			//System.out.println("Yayy"+k);
			sub = str.substring(i,i+k);
			if(sub.charAt(0) == '0')
				return false;
			
			arr[j] = Long.parseLong(sub);
			if((arr[j]-arr[j-1]) != 1)
			{	
				k++;
				return Solution.fun(str,k,i,arr[j-1]);
			}
			j++;
		}
		if(str.length()%k != 0)
		{
			return false;
		}
		return true;
	}
	static boolean fun(String str,int k,int index,long first)
	{
		long [] arr = new long[32];
		arr[0] = first;
		String sub = "";
		int val = str.length() - index;
		//System.out.println(val+"  "+k);
		if(val%k != 0)
		{
			return false;
		}
		int j = 1;
		for(int i = index ; i<=str.length()-k;i += k)
		{
			sub = str.substring(i,i+k);
			if(sub.charAt(0) == '0')
				return false;
			
			arr[j] = Long.parseLong(sub);
			if((arr[j]-arr[j-1]) != 1)
				return false;
			j++;
		}
		return true;
	}
}