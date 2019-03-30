import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		TreeSet<Integer> tsa = new TreeSet<>();
		TreeSet<Integer> tsb = new TreeSet<>();

		tk = new StringTokenizer(in.readLine());
		while(tk.hasMoreTokens())
		{
			tsa.add(Integer.parseInt(tk.nextToken()));
		}
		tk = new StringTokenizer(in.readLine());
		while(tk.hasMoreTokens())
		{
			tsb.add(Integer.parseInt(tk.nextToken()));
		}
		int first = tsa.last();
		int last = tsb.first();
		int count = 0;
		TreeSet<Integer> fs = new TreeSet<>();
		for(int i = first ; i <= last ; i++)
		{
			
				int val = i;
				boolean f1 = true ;
				boolean f2 = true ;
				//System.out.print(val+" :");
				for(Integer ob : tsa)
				{
					if(val%ob!=0)
					{
						f1 = false;
						break;
					}
				}

				if(f1)
				{
					for(Integer ob : tsb)
					{
						if(ob%val!=0)
						{
							f2=false;
							break;
						}
					}
				}
				if(f2 && f1 )
				{
					fs.add(val);
				}
				//System.out.println(f1+"   "+f2);
		}
		System.out.println(fs.size());
		//System.out.println(fs);
	}
}