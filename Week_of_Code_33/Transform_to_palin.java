import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.TreeSet;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		ArrayList<TreeSet<Integer>> al = new ArrayList<>();
		int n = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		for(int i=0;i<=n;i++)
		{
			TreeSet<Integer> temp = new TreeSet<>();
			temp.add(i);
			al.add(temp);
		}
		for(int i=0;i<k;i++)
		{
			tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			TreeSet<Integer> ta = al.get(a);
			TreeSet<Integer> tb = al.get(b);
			ta.add(b);
			tb.add(a);
			ta.addAll(tb);
			tb.addAll(ta);
			for(Integer ob : ta)
			{
				TreeSet<Integer> tob = al.get(ob);
				tob.addAll(tb);
			}
			for(Integer ob : tb)
			{
				TreeSet<Integer> tob = al.get(ob);
				tob.addAll(ta);
			}
		}
		Integer i=0;
		tk = new StringTokenizer(in.readLine());
		int [] arr = new int[m];
		while(tk.hasMoreTokens())
		{
			int val = Integer.parseInt(tk.nextToken());
			TreeSet<Integer> ts = al.get(val);
			arr[i] = ts.first();
			//System.out.print(arr[i]+"  ");
			i++;
		}
		int [][] len = new int [m][m];

		for(int j=0;j<m;j++)
			len[j][j] = 1;

		for(int c1=2 ; c1<=m;c1++)
		{
			for(int j=0;j<m-c1+1;j++)
			{
				int l = j + c1 - 1;
				if(arr[j]==arr[l] && c1 == 2)
					len[j][l] = 2;
				else if(arr[j] == arr[l])
					len[j][l] = len[j+1][l-1] + 2;
				else
					len[j][l] = Math.max( len[j][l-1] , len[j+1][l] );
			}
		}
		System.out.println(len[0][m-1]);
	}
}