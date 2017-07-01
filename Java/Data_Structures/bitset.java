import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.BitSet;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int m = Integer.parseInt(tk.nextToken());
		BitSet b1 = new BitSet(m);
		BitSet b2 = new BitSet(m);
		b1.clear();
		b2.clear();
		int n = Integer.parseInt(tk.nextToken());
		for(int i=0;i<n;i++)
		{
			tk = new StringTokenizer(in.readLine());
			String str = tk.nextToken();
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			switch (str)
			{
				case "AND" :
								if(a==1)
									b1.and(b2);
								else
									b2.and(b1);
								break;
				case "OR"  :
								if(a==1)
									b1.or(b2);
								else
									b2.or(b1);
								break;	
				case "XOR" :
								if(a==1)
									b1.xor(b2);
								else
									b2.xor(b1);
								break;
				case "FLIP":
								if(a==1)
									b1.flip(b);
								else
									b2.flip(b);
								break;
				case "SET" :
								if(a==1)
									b1.set(b);
								else
									b2.set(b);
								break;

			}
			System.out.println(b1.cardinality()+" "+b2.cardinality());
		}
	}
}