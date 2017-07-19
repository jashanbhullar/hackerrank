import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ArrayList<Integer> al = new ArrayList<>();
		int [] arr = new int[n];
		int [] res = new int[n];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(tk.nextToken());
			res[i] = arr[i];
		}
		Arrays.sort(res);
		for(int i=0;i<n;i++)
		{
			if(arr[i] != res[i])
				al.add(i+1);
		}
		if(al.size() == 0)
			System.out.println("yes");
		else if(al.size() == 2)
		{
			System.out.println("yes");
			System.out.println("swap "+al.get(0)+" "+al.get(1));
		}
		else if(check(al,arr))
		{
			System.out.println("yes");
			System.out.println("reverse "+al.get(0)+" "+al.get(al.size()-1));
		}
		else
		{
			System.out.println("no");
		}
	}
	public static boolean check(ArrayList<Integer> al,int [] arr)
	{
		int val = al.get(al.size()-1) + 1 - al.get(0);
		int [] res = new int[val];
		int add = al.get(0) - 1;
		for(int i=0;i<val;i++)
		{
			res[i] = add + i;
		}
		for(int i=1;i<al.size();i++)
		{
			if(arr[res[i]]>arr[res[i-1]])
				return false;
		}
		return true;
	}
}