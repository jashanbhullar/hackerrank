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
		int [] arr = new int[k];
		tk = new StringTokenizer(in.readLine());
		while(tk.hasMoreTokens())
		{
			int val = (Integer.parseInt(tk.nextToken()))%k;
			arr[val]++;
		}
		//Solution.display(arr);
		if(arr[0]!=0)
			arr[0]=1;
		if(k%2==0 && arr[k/2]!=0)
		{
			arr[k/2]=1;
		}
		//Solution.display(arr);
		int sum=arr[0];
		int max=0;
		for(int i=1;i<=k/2;i++)
		{
			max = Math.max(arr[i],arr[k-i]);
			sum += max;
		}
		System.out.println(sum);
	}
	static void display(int [] a)
	{
		for(int n : a)
			System.out.print(n+"  ");
		System.out.println();
	}
}