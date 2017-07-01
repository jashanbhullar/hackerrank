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

		boolean [] arr = new boolean[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = tk.nextToken().equals("0") ? false : true ;		
		}

		int energy = 0;
		int i=k;
		while(i!=0)
		{
			if(i==n)
				break;
			if(arr[i]==true)
				energy += 3;
			else
				energy++;
			i += k;
			if(i>=n)
			{
				i -= n;
			}
		}
		energy = 100 - energy;
		if(arr[0]==true)
			energy -= 3;
		else
			energy --;
		System.out.println(energy);
	}
}