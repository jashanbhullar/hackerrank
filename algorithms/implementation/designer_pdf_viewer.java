import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String [] split = in.readLine().split(" ");
		int [] arr = new int[26];
		for(int i=0;i<26;i++)
		{
			arr[i]=Integer.parseInt(split[i]);
			//System.out.print(arr[i]+" ");
		}
		String str = in.readLine();
		int max =0;
		for(int i=0;i<str.length();i++)
		{
			int index = (int)str.charAt(i)-97;
			max = (max>arr[index]) ? max : arr[index];
		}
		int res = str.length()*max;
		System.out.println(res);
	}
}