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
		al.add(0);
		while(tk.hasMoreTokens())
			al.add(Integer.parseInt(tk.nextToken()));
		for(int i=1;i<=n;i++)
		{
			int p = al.indexOf(i);
			p = al.indexOf(p);
			System.out.println(p);
		}
	}
}