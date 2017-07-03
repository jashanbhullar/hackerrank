import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.ArrayList;


class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String str = in.readLine();
		Pattern pt = Pattern.compile("([a-z])\\1");
		Matcher mt = pt.matcher(str);
		HashSet<String> hs = new HashSet<>();
		while(mt.find())
			hs.add(mt.group(1));

		for(String ob : hs)
			str =  str.replaceAll(ob,"");
		hs.clear();

		for(int i=0;i<str.length();i++)
			hs.add(str.substring(i,i+1));
		ArrayList<String> al = new ArrayList<>();
		al.addAll(hs);
		//System.out.println(al);
		int max = 0;
		String res = "";
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				String a = al.get(i);
				String b = al.get(j);
				for(int k=0;k<str.length();k++)
				{
					String val =  str.substring(k,k+1);
					if(val.equals(a) || val.equals(b) )
						res += val;
				}
				int x = res.length();
				//System.out.println(res);
				res = res.replaceAll("([a-z])\\1","");
				int y = res.length();
				if(x == y)
				{
					max = Math.max(max,y);
				}
				res = "";
			}
			str = str.replaceAll(al.get(i),"");
		}
		System.out.println(max);
	}
}