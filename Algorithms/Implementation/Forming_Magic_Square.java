import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	static int[][] by10(int [][]arr)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr[i][j]=10-arr[i][j];
		}
		return arr;
	}
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int [][] a1 = new int[3][3];
		int [][] a2 = new int[3][3];
		int [][] a3 = new int[3][3];
		int [][] a4 = new int[3][3];
		a1[0][0]=8;	a1[0][1]=1;	a1[0][2]=6;
		a1[1][0]=3;	a1[1][1]=5;	a1[1][2]=7;
		a1[2][0]=4;	a1[2][1]=9;	a1[2][2]=2;

		a2[0][0]=8;	a2[0][1]=3;	a2[0][2]=4;
		a2[1][0]=1;	a2[1][1]=5;	a2[1][2]=9;
		a2[2][0]=6;	a2[2][1]=7;	a2[2][2]=2;

		a3[0][0]=4;	a3[0][1]=3;	a3[0][2]=8;
		a3[1][0]=9;	a3[1][1]=5;	a3[1][2]=1;
		a3[2][0]=2;	a3[2][1]=7;	a3[2][2]=6;

		a4[0][0]=4;	a4[0][1]=9;	a4[0][2]=2;
		a4[1][0]=3;	a4[1][1]=5;	a4[1][2]=7;
		a4[2][0]=8;	a4[2][1]=1;	a4[2][2]=6;

		int val = 3200;
		int [][] arr = new int[3][3];
		for(int i=0;i<3;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			for(int j=0;j<3;j++)
				arr[i][j] = Integer.parseInt(tk.nextToken());
		}

		val = Solution.fun(a1,arr,val);
		val = Solution.fun(a2,arr,val);
		val = Solution.fun(a3,arr,val);
		val = Solution.fun(a4,arr,val);

		a1 = Solution.by10(a1);
		a2 = Solution.by10(a2);
		a3 = Solution.by10(a3);
		a4 = Solution.by10(a4);

		//Solution.display(a1);
		//Solution.display(a2);
		//Solution.display(a3);
		//Solution.display(a4);

		val = Solution.fun(a1,arr,val);
		val = Solution.fun(a2,arr,val);
		val = Solution.fun(a3,arr,val);
		val = Solution.fun(a4,arr,val);

		System.out.println(val);


	}
	static int fun(int[][] arr,int[][] a,int val)
	{
		int res=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				res += Math.abs(arr[i][j]-a[i][j]);
				if(res>val)
					return val;
			}
		}
		return res;
	}
	static void display(int [][] arr)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("/n");
	}
}