import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.TreeSet;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(in.readLine());
		HashMap<String,TreeSet<Integer>> hm = new HashMap<>();
		for(int j=0;j<q;j++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			String cmd = tk.nextToken();
			if(cmd.equals("crt"))
			{
				String str = tk.nextToken();
				if(!(hm.containsKey(str)))
				{
					hm.put(str,new TreeSet<Integer>());
					System.out.println("+ "+str);
				}
				else
				{
					int i=1;
					TreeSet<Integer> ts = hm.get(str);
					for(Integer on : ts)
					{
						if(on!=i)
							break;
						i++;
					}
					ts.add(i);
					System.out.println("+ "+str+"("+i+")");
				}
				
			}
			else if(cmd.equals("del"))
			{
				String str = tk.nextToken();
				TreeSet<Integer> ts = hm.get(str);
				if(ts.size()==0)
				{
					hm.remove(str);
					System.out.println("- "+str);
				}
				else
				{
					int first = str.indexOf("(")+1;
					String sub = str.substring(first+1,str.length()-1);
					int rem = Integer.parseInt(sub);
					ts.remove(rem);
					System.out.println("- "+str+"("+rem+")");
				}
			}
			else
			{
				String str = tk.nextToken();
				String str2 = tk.nextToken();
				TreeSet<Integer> ts = hm.get(str);
				if(ts.size()==0)
				{
					hm.remove(str);
				}
				else
				{
					int first = str.indexOf("(")+1;
					String sub = str.substring(first+1,str.length()-1);
					int rem = Integer.parseInt(sub);
					ts.remove(rem);
					str = str+"("+String.valueOf(rem)+")";
				}
				if(!(hm.containsKey(str2)))
				{
					hm.put(str2,new TreeSet<Integer>());
					System.out.println("r "+str+" -> "+str2);
				}
				else
				{
					int i=1;
					ts = hm.get(str2);
					for(Integer on : ts)
					{
						if(on!=i)
							break;
						i++;
					}
					ts.add(i);
					System.out.println("r "+str+" -> "+str2+"("+i+")");
				}
			}
		}
	}
}