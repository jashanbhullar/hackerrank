import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

class Solution
{
	static String add(HashSet<String> hs,String str)
	{
		int i=1;
		StringBuffer sbr = new StringBuffer(str);
		sbr = sbr.append("(1)");
		while(!(hs.add(sbr.toString())))
		{
			i++;
			sbr = new StringBuffer(str);
			sbr = sbr.append("("+String.valueOf(i)+")"); 
		}
		return sbr.toString();
	}
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(in.readLine());
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<q;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			String cmd = tk.nextToken();
			if(cmd.equals("crt"))
			{
				String str = tk.nextToken();
				if(hs.add(str))
				{
					System.out.println("+ "+str);
				}
				else
				{
					str = Solution.add(hs,str);
					System.out.println("+ "+str);
				}
			}
			else if(cmd.equals("del"))
			{
				String str = tk.nextToken();
				hs.remove(str);
				System.out.println("- "+str);
			}
			else
			{
				String str = tk.nextToken();
				String str2 = tk.nextToken();
				hs.remove(str);
				if(hs.add(str2))
				{
					System.out.println("r "+str+" -> "+str2);
				}
				else
				{
					str2 = Solution.add(hs,str2);
					System.out.println("r "+str+" -> "+str2);
				}
			}
		}
	}
}