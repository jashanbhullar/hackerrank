import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ArrayList<Integer> al = new ArrayList<>();
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int res=0;
		while(tk.hasMoreTokens())
		{
			Integer val = new Integer(Integer.parseInt(tk.nextToken()));
			if(al.contains(val))
			{
				al.remove(val);
				res++;
			}
			else
				al.add(val);
		}
		System.out.println(res);
	}
}
