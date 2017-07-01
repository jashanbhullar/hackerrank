import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(tk.nextToken());
		}
		tk = new StringTokenizer(in.readLine());
		int d = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		int sum =0;
		int res=0;
		for(int i=0;i<m;i++)
		{
			sum += arr[i];
		}
		//System.out.println("First sum: "+sum);
		if(sum==d)
			res++;
		for(int i=1;i<=arr.length-m;i++)
		{
			sum -= arr[i-1];
			sum += arr[i+m-1];
			//System.out.println("Sum no :"+ i +" "+sum);
			if(sum==d)
				res++;
		}
		System.out.println(res);
	}
}