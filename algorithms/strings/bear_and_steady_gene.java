import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

class Solution
{ 
	static int n;
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		String str = in.readLine();
		HashMap<Character,Integer> hm = new HashMap<>();
		hm.put('A',0);
		hm.put('G',0);
		hm.put('C',0);
		hm.put('T',0);
		for(int i=0;i<n;i++)
		{
			char ch = str.charAt(i);
			hm.put(ch,hm.get(ch)+1);
		}
		if(Solution.fun(hm))
		{
			System.out.println(0);
			System.exit(0);
		}
		int start = 0;
		int end = 0;
		int val = Integer.MAX_VALUE;
		while(end < n)
		{
			char ec = str.charAt(end++);
			hm.put(ec , hm.get(ec) - 1);

			while(Solution.fun(hm))
			{
				val = Math.min(val,end - start);
				char sc = str.charAt(start++);
				hm.put(sc , hm.get(sc) + 1);
			}
		}
		System.out.println(val);
	}
	public static boolean fun(HashMap<Character,Integer> hm)
	{
		for(int i : hm.values())
		{
			if(i > n/4)
				return false;
		}
		return true;
	}
}