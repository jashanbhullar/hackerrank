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
		int k = Integer.parseInt(tk.nextToken());

		tk = new StringTokenizer(in.readLine());
		int page = 0;
		int res = 0;
		for(int i=0;i<n;i++)
		{
			int start = page+1;
			int val = Integer.parseInt(tk.nextToken());
			page += (val%k==0) ? val/k : (val/k)+1;
			//System.out.println(start+"  "+page);
			int prob = 0;
			for(int j=start ;j<=page ;j++)
			{
				if((prob+k)>val)
				{
					if(prob<j && j<=val)
						res++;
					break;
				}
				if(prob<j && j<=(prob+k))
				{
					res++;
				}
				prob += k;
			}
		}
		System.out.println(res);
	}
}