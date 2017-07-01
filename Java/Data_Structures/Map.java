import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.HashMap;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		HashMap<String,String> hm = new HashMap<String,String>();
		for(int i=0;i<n;i++)
		{
			String name = in.readLine();
			String num = in.readLine();
			hm.put(name,num);
		}
		String str;
		while((str=in.readLine())!=null)
		{
			if(hm.get(str)==null)
				System.out.println("Not found");
			else
				System.out.println(str+"="+hm.get(str));
		}
	}
}