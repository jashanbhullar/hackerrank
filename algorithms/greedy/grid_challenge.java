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
			int n = Integer.parseInt(in.readLine());
			char [][] ch = new char[n][n];
			for(int i=0;i<n;i++)
			{
				String str = in.readLine();
				for(int j=0;j<n;j++)
				{
					char val = str.charAt(j);
					int k = j - 1;
					while(k>=0 && ch[i][k]>val)
					{
						ch[i][k+1] = ch[i][k];
						k--;
					}
					ch[i][k+1] = val; 
				}
			}
			boolean flag = false;
			for(int i=0;i<n;i++)
			{
				for(int j=1;j<n;j++)
				{
					if(ch[j][i]<ch[j-1][i])
					{
						flag = true;
						break;
					}
				}
				if(flag)
					break;
			}
			String res = flag ? "NO" : "YES";
			System.out.println(res);
		}
	}
}