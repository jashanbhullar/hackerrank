import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++)
		{
			int n = Integer.parseInt(in.readLine());
			String str = in.readLine();
			int [] arr = new int[27];
			for(int j=0;j<n;j++)
			{
				if(str.charAt(j)=='_')
					arr[26]++;
				else
				{
					int val = (int)str.charAt(j) - 65;
					arr[val]++;
				}
			}
			if(arr[26]==0)
			{
				boolean flag = false;
				for(int j=1;j<n-1;j++)
				{
					char left = str.charAt(j-1);
					char right = str.charAt(j+1);
					char check = str.charAt(j);
					if(check != left && check != right)
					{
						flag = true;
						break;
					}
				}
				if(n>1)
				{
					if(str.charAt(0) != str.charAt(1))
						flag = true;
					if(str.charAt(n-1) != str.charAt(n-2))
						flag = true;
				}
				if(n==1)
					flag=true;
				if(flag)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
			else
			{
				boolean flag=false;
				for(int j=0;j<26;j++)
				{
					if(arr[j]==1)
					{
						flag = true;
						break;
					}
				}
				if(flag)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
		}
	}
}