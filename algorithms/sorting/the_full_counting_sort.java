import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		TreeMap<Integer,StringBuilder> tm = new TreeMap<>();

		for(int i=0;i<n/2;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int index = Integer.parseInt(tk.nextToken());
			try
			{
				tm.put(index,tm.get(index).append(" -"));
			}catch(Exception e)
			{
				StringBuilder str = new StringBuilder("-");
				tm.put(index,str);
			}
		}
		for(int i=0;i<n/2;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int index = Integer.parseInt(tk.nextToken());
			String val = tk.nextToken();
			try
			{
				tm.put(index,tm.get(index).append(" "+val));
			}catch(Exception e)
			{
				StringBuilder str = new StringBuilder(val);
				tm.put(index,str);
			}	
		}
		for(StringBuilder ob : tm.values())
			System.out.print(ob+" ");
		System.out.println();
	}
}