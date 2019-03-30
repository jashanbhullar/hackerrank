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
		int b = Integer.parseInt(tk.nextToken());
		int a = Integer.parseInt(tk.nextToken());

		int [] arr = new int[8];
		arr[0] = n - b;
		arr[1] = b - 1;
		arr[2] = n - a;
		arr[3] = a - 1;
		int c1 = b - a;
		int c2 = b + a;
		if(c1<=0)
		{
			//System.out.println("Ran 1");
			arr[4] = n - a;
			arr[5] = b - 1;

		}
		else
		{
			//System.out.println("Ran 2");
			arr[4] = n - b;
			arr[5] = a - 1;
		}
		if(c2<=n)
		{
			//System.out.println("Ran 1");
			arr[6] = a - 1;
			arr[7] = b - 1;
		}
		else
		{
			//System.out.println("Ran 2");
			arr[6] = n - b;
			arr[7] = n - a;
		}
		//Solution.display(arr);
		for(int i=0;i<k;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int y = Integer.parseInt(tk.nextToken());
			int x = Integer.parseInt(tk.nextToken());
			if(y==b)
			{
				if(x>a)
					arr[0] = Math.min(arr[0],x-a-1);
				else
					arr[1] = Math.min(arr[1],a-x-1);
			}
			else if(x==a)
			{
				if(y>b)
					arr[2] = Math.min(arr[2],y-b-1);
				else
					arr[3] = Math.min(arr[3],b-y-1);
			}
			else if((y-x)==c1)
			{
				if(x>a)
					arr[4] = Math.min(arr[4],x-a-1);
				else
					arr[5] = Math.min(arr[5],a-x-1);
			}
			else if((x+y)==c2)
			{
				if(x<a)
					arr[6] = Math.min(arr[6],a-x-1);
				else
					arr[7] = Math.min(arr[7],x-a-1);
			}
			//Solution.display(arr);
		}
		int res = 0;
		for(int i=0;i<8;i++)
			res += arr[i];
		System.out.println(res);
	}
	static void display(int [] arr)
	{
		for(int n : arr)
			System.out.print("  "+n);
		System.out.println();
	}
}