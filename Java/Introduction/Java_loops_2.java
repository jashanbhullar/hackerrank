import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
	static int power(int num)
	{
		int result=2;
		for(int i=1;i<num;i++)
		{
			result = result * 2;
		}
		return result;
	}
	public static void main(String ... ags)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			int c = Integer.parseInt(tk.nextToken());
			int sum=a+b;
			System.out.print(sum +" ");
			for(int j=1;j<c;j++)
			{
				sum = sum+(power(j)*b);
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}