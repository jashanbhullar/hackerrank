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
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		ArrayList<Integer> al = new ArrayList<>();
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int l = Integer.parseInt(tk.nextToken());
			int t = Integer.parseInt(tk.nextToken());
			if(t == 1)
				al.add(l);
			sum += l;
		}
		Collections.sort(al);
		k = al.size() - k;
		for(int i=0;i<k;i++)
			sum -= 2*al.get(i);
		System.out.println(sum);
	}
}