import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ArrayList<String> al = new ArrayList<>();
		for(int i=0;i<n;i++)
			al.add(in.readLine());
		Collections.sort(al,new Comparator<String>()
		{
			@Override
			public int compare(String a, String b)
			{
				if(a.length()-b.length() != 0)
					return a.length()-b.length();
				for(int i=0;i<a.length();i++)
				{
					int val = (int)a.charAt(i) - (int)b.charAt(i);
					if(val != 0)
						return val;
				}
				return 0;
			}
		});
		for(String ob : al)
			System.out.println(ob);
	}
}