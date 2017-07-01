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
		int d = Integer.parseInt(tk.nextToken());
		int [] arr = new int[n];

		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(tk.nextToken());
		int res=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				int a = arr[j] - arr[i];
				//System.out.println("A is :"+a);
				if(a==d)
				{
					for(int k=j+1;k<n;k++)
					{
						int b = arr[k] - arr[j];
						//System.out.println("B is :"+b);
						if(b==d)
							res++;
						else if(b>d)
							break;
					}
				}
				else if(a>d)
					break;
			}
		}
		System.out.println(res);
	}
}