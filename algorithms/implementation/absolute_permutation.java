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
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			if(k==0)
			{
				for(int i=1;i<=n;i++)
					System.out.print(i+" ");
				System.out.println();
			}
			else if(n%2 != 0 || n%(2*k) != 0)
				System.out.println("-1");
			else
			{
				//System.out.println("In here");
				int x = k;
				int c = 0;
				int val = 0 ;
				for(int i=1;i<=n;i++)
				{
					//System.out.println("In "+i+" loop");
					if(c == 0)
					{
						//System.out.println("In while loop");
						while(x != 0 && i<=n)
						{
							val = i + k;
							System.out.print(val+" ");
							x--;
							i++;
						}
						c = 1;
						i--;
					}
					else
					{
						while(x != 0 && i<=n)
						{
							val = i - k;
							System.out.print(val+" ");
							x--;
							i++;
						}
						c = 0;
						i--;
					}
					x = k;
				}
				System.out.println();	
			}
		}
	}
}