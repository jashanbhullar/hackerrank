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
			int res = 0;
			for(int i=1;i<str.length();i++)
			{
				String [] arr = new String[str.length()+1-i];
				//System.out.println(i+" "+arr.length);
				for(int j=0;j<arr.length;j++)
					arr[j] = str.substring(j,j+i);

				for(int j=0;j<arr.length;j++)
				{
					String ob1 = arr[j];
					for(int k=j+1;k<arr.length;k++)
					{
						String ob2 = arr[k];
						if(Solution.fun(ob1,ob2))
							res++;
					}
				}
			}
			System.out.println(res);
		}
	}
	public static boolean fun(String ob1, String ob2)
	{
		int [] a1 = new int[26];
		int [] a2 = new int[26];

		for(int i=0;i<ob1.length();i++)
		{
			int a = (int)ob1.charAt(i) - 97;
			int b = (int)ob2.charAt(i) - 97;
			a1[a]++;
			a2[b]++;
		}

		for(int i=0;i<26;i++)
		{
			if(a1[i] != a2[i])
				return false;
		}
		return true;
	}
}