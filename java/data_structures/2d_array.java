import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Solution
{
	static int function(int [][] arr, int row,int col)
	{
		int sum =0;
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[row][col+i];
		}
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[row+2][col+i];
		}
		sum=sum+arr[row+1][col+1];
		return sum;
	}
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int [][] arr = new int[6][6];
		for(int i=0;i<6;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			for(int j=0;j<6;j++)
			{
				arr[i][j]=Integer.parseInt(tk.nextToken());
			}
		}
		int sum=0;
		int res=-100;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				sum=function(arr,i,j);
				if(sum>res)
					res=sum;
			}
		}
		System.out.println(res);
	}
}