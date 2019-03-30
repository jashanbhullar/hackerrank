import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

class Solution
{
	static int n;
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		HashMap<Integer,Integer> ar = new HashMap<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
		int[] sr = new int[n];
		int[] rr = new int[n];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			int val = Integer.parseInt(tk.nextToken());
			ar.put(val,i);
			hm.put(i,val);
			sr[i] = val;
		}
		Arrays.sort(sr);
		for(int i=0;i<n;i++)
			rr[n-1-i] = sr[i];
		//System.out.println(ar);
		//System.out.println(hm);
		int res = Math.min(Solution.fun(sr,ar,hm),Solution.fun(rr,ar,hm));
		System.out.println(res);
	}
	public static int fun(int [] sr, HashMap<Integer,Integer> hm1,HashMap<Integer,Integer> hm2)
	{
		HashMap<Integer,Integer> ar = new HashMap<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
		ar.putAll(hm1);
		hm.putAll(hm2);
		int res = 0;
		for(int i=0;i<n;i++)
		{
			// 1 2 3 5
			int index = ar.get(sr[i]);
			if(index != i)
			{
				int val = hm.get(i);
				//ar.put(sr[i],i);
				//hm.put(i,sr[i]);
				ar.put(val,index);
				hm.put(index,val);
				//System.out.println();
				//System.out.println(ar);
				//System.out.println(hm);
				res++;
			}
		}
		return res;
	}
}