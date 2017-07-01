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
		int index = Integer.parseInt(tk.nextToken());
		int sum =0;
		int i=0;
		tk = new StringTokenizer(in.readLine());
		while(tk.hasMoreTokens())
		{
			val = Integer.parseInt(tk.nextToken());
			if(i!=index)
			{
				sum += val;
			}
			i++;
		}
		System.out.println(sum);
		sum = sum/2;
		int b = sum - Integer.parseInt(in.readLine());
		if(b==0)
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(b);
		}

	}
}