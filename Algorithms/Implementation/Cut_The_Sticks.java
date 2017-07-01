import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		ArrayList<Integer> al = new ArrayList<>();
		while(tk.hasMoreTokens())
			al.add(Integer.parseInt(tk.nextToken()));
		Collections.sort(al);
		while(al.size()!=0)
		{
			System.out.println(al.size());
			int val = al.get(0);
			for(int i=0;i<al.size();)
			{
				if(val!=al.get(0))
					break;
				al.remove(0);
			}
			//System.out.println(al);
		}
	}
}