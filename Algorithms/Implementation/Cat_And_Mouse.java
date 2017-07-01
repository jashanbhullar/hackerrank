import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			int c = Integer.parseInt(tk.nextToken());
			a = Math.abs(c-a);
			b = Math.abs(c-b);
			if(a==b)
				System.out.println("Mouse C");
			else if(a>b)
				System.out.println("Cat B");
			else
				System.out.println("Cat A");
		}
	}
}