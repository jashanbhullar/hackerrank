import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		Pattern pt = Pattern.compile("([a-z])(\\1)*");
		Matcher mt = pt.matcher(str);
		int [] arr = new int[27];
		while(mt.find())
		{
			String res = mt.group(0);
			int index = (int)res.charAt(0) - 96;
			int val = res.length() * index;
			arr[index] = Math.max(arr[index],val);
			//System.out.println(index + "  "+arr[index]);
		}
		int q = Integer.parseInt(in.readLine());
		for(int t=0;t<q;t++)
		{
			int val = Integer.parseInt(in.readLine());
			boolean flag = false;
			for(int i=1;i<27;i++)
			{
				if(val==arr[i])
				{
					flag = true;
					break;
				}
				else if(val<arr[i])
				{
					flag = ( val%i == 0 ) ? true : false;
					if(flag)
						break;
				}
			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}