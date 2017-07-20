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
		String str = in.readLine();
		int [] arr = new int[26];
		for(int i=0;i<str.length();i++)
		{
			int val = (int)str.charAt(i) - 97;
			arr[val]++;
		}
		Arrays.sort(arr);
		int a = arr[25];
		int b = arr[24];
		if( a == 1)
		{
			System.out.println("YES");
			System.exit(0);
		}
		if(b == 0)
		{
			System.out.println("YES");
			System.exit(0);
		}
		if(b == 1)
		{
			int c = arr[23];
			if(c == 0)
			{
				System.out.println("YES");
				System.exit(0);
			}
			else if(a > 2)
			{
				System.out.println("NO");
				System.exit(0);
			}
		}
		else if((a-b)>1)
		{
			System.out.println("NO");
			System.exit(0);
		}
		int count = 0;
		for(int i=0;i<24;i++)
		{
			if(arr[i] != 0)
			{
				if(arr[i] == 1)
					count++;
				else if(arr[i] != b)
				{
					System.out.println("NO");
					System.exit(0);
				}
			}
		}	
		if(a <= 2 && b == 1 )
		{
			System.out.println("YES");
			System.exit(0);
		}
		else if( a == b && count <= 1)
		{
			System.out.println("YES");
			System.exit(0);
		}
		else if (a - b == 1 && count == 0 )
		{
			System.out.println("YES");
			System.exit(0);
		}
		else 
		{
			System.out.println("NO");
			System.exit(0);
		}
	}
}