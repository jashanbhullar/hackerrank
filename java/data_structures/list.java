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
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
			arr.add(Integer.parseInt(tk.nextToken()));
		int que = Integer.parseInt(in.readLine());
		for(int i=0;i<que;i++)
		{
			String str=in.readLine();
			if(str.compareTo("Insert")==0)
			{
				tk = new StringTokenizer(in.readLine());
				int index = Integer.parseInt(tk.nextToken());
				int val = Integer.parseInt(tk.nextToken());
				arr.add(index,val);
			}
			else
			{
				int index = Integer.parseInt(in.readLine());
				arr.remove(index);
			}
		}
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(arr.get(i)+" ");
		}
	}
}