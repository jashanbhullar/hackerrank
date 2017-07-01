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
		int x1 = Integer.parseInt(tk.nextToken());
		int v1 = Integer.parseInt(tk.nextToken());
		int x2 = Integer.parseInt(tk.nextToken());
		int v2 = Integer.parseInt(tk.nextToken());
		int diffx = x2 - x1 ;
		int diffv = v2 - v1 ;
		if(diffx == 0)
		{
			System.out.println("YES");
		}
		else if(diffx > 0)
		{
			if(diffv >=	 0)
			{
				System.out.println("NO");
			}
			else
			{
				if (diffx%diffv==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
		else
		{
			if(diffv <= 0)
				System.out.println("NO");
			else
			{
				if(diffx%diffv==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}