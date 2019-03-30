import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++)
		{
			int n=Integer.parseInt(in.readLine());
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int [] arr = new int [n];
			int max=0;
			int maxIndex=0;
			for(int j=0;j<n;j++)
			{
				arr[j]=Integer.parseInt(tk.nextToken());
				if(arr[j]>max)
				{
					max=arr[j];
					maxIndex=j;
				}				
			}
			int sum=0;
			for(int j=maxIndex;j<arr.length;j++)
			{
				if((j-maxIndex)%2==0)
				{
					sum += arr[j]-1;
				}
				else
				{
					sum += arr[j-1]-1;
				}
			}
			for(int j=maxIndex-1;j>0;j--)
			{
				if((maxIndex-j)%2==0)
				{
					sum += arr[j]-1;
				}
				else
				{
					sum += arr[j-1]-1;
				}
			}
			if(maxIndex==0)
			{
				sum -= arr[0]+1;
			}
			System.out.println(sum);
		}
	}
}