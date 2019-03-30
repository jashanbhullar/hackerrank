import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int t=0;t<n;t++)
		{
			String str =  in.readLine();
			int index = str.length();
			for(int i=str.length()-2;i>=0;i--)
			{
				int j = i+1;
				if(str.charAt(i) < str.charAt(j))
				{
					index = i;
					break;
				}
			}
			if(index==str.length())
				System.out.println("no answer");
			else
			{
				char ch = str.charAt(index);
				int replace = 0;
				for(int i=str.length()-1;i>index;i--)
				{
					if(ch < str.charAt(i))
					{
						replace = i;
						break;
					}
				}
				char [] arr = str.toCharArray();
				char temp = arr[index];
				arr[index] = arr[replace];
				arr[replace] = temp;
				Arrays.sort(arr,index,str.length()-1);
				String res = "";
				for(char ob : arr)
					res += ob;
				System.out.println(res);
			}
		}
	}
}