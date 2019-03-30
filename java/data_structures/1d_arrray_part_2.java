import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Solution
{
	static boolean move(int [] arr, int pos,int m)
	{
		int a = pos-1;
		if(a<0)
			a=0;
		int b = pos+1;
		int c = pos+m;
		arr[pos]=1;
		if(b>=arr.length || c>=arr.length)
			return true;
		if(arr[a]==0)
			if(Solution.move(arr,a,m))
				return true;
		if(arr[b]==0)
			if(Solution.move(arr,b,m))
				return true;
		if(arr[c]==0)
			if(Solution.move(arr,c,m))
				return true;
		return false;

	}
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int len = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());
			int [] arr = new int [len];
			tk = new StringTokenizer(in.readLine());
			for(int j=0 ;j<len;j++)
			{
				arr[j] = Integer.parseInt(tk.nextToken());
			} 	
			if(Solution.move(arr,0,m))
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}
}