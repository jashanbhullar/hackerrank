import java.util.Scanner;

class Solution
{
	public static void main(String ... ags)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res = 0;
		for(int i=0;i<n;i++)
		{
			res ^= in.nextInt();
		}
		System.out.println(res);
	}
}