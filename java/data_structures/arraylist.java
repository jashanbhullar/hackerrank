import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ArrayList<ArrayList> arr = new ArrayList<ArrayList>();
		for(int i=0;i<n;i++)
		{
			arr.add(new ArrayList<Integer>());
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int num=Integer.parseInt(tk.nextToken());
			for(int j=0;j<num;j++)
			{
				arr.get(i).add(Integer.parseInt(tk.nextToken()));
			}
		}
		int que=Integer.parseInt(in.readLine());
		for(int i=0;i<que;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken())-1;
			int b = Integer.parseInt(tk.nextToken())-1;
			//System.out.println(a+" "+b);
			try
			{
				int res = (int) arr.get(a).get(b);
				System.out.println(res);
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("ERROR!");
			}
		}
	}
}