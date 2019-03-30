import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int r = Integer.parseInt(tk.nextToken());
		int c = Integer.parseInt(tk.nextToken());
		int n = Integer.parseInt(tk.nextToken());


		char [][] ch = new char[r][c];
		for(int i=0;i<r;i++)
		{
			String str = in.readLine();
			for(int j=0;j<c;j++)
				ch[i][j] = str.charAt(j);
		}


		char [][] zr = new char[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				zr[i][j] = 'O';
		}

		char [][] rs = new char[r][c];
		char up = '.';
		char down = '.';
		char left = '.';
		char right = '.';
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				char val = ch[i][j];
				if(val == 'O')
					rs[i][j] = '.';
				
				else
				{
					try
					{
						up = ch[i][j-1];
					}catch(Exception e){	up ='.';	}
					try
					{
						down = ch[i][j+1];
					}catch(Exception e){	down ='.';	}
					try
					{
						right  = ch[i+1][j];
					}catch(Exception e){	right ='.';	}
					try
					{
						left = ch[i-1][j];
					}catch(Exception e){	left ='.';	}
					if( up == 'O' || down == 'O' || left == 'O' || right =='O')
						rs[i][j] = '.';
					else
						rs[i][j] = 'O';
				}
			}
		}

		char[][] rs2 = new char[r][c];
		up = '.';
		down = '.';
		left = '.';
		right = '.';
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				char val = rs[i][j];
				if(val == 'O')
					rs2[i][j] = '.';
				
				else
				{
					try
					{
						up = rs[i][j-1];
					}catch(Exception e){	up ='.';	}
					try
					{
						down = rs[i][j+1];
					}catch(Exception e){	down ='.';	}
					try
					{
						right  = rs[i+1][j];
					}catch(Exception e){	right ='.';	}
					try
					{
						left = rs[i-1][j];
					}catch(Exception e){	left ='.';	}
					if( up == 'O' || down == 'O' || left == 'O' || right =='O')
						rs2[i][j] = '.';
					else
						rs2[i][j] = 'O';
				}
			}
		}
		//System.out.println();
		if(n == 1)
			Solution.display(ch,r,c);
		else if(n%2 == 0)
			Solution.display(zr,r,c);
		else if(n == 3)
			Solution.display(rs,r,c);
		else if(n%4 == 3)
			Solution.display(rs,r,c);
		else if(n%4 == 1)
			Solution.display(rs2,r,c);
	}
	static void display(char [][] ch,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(ch[i][j]);
			System.out.println();
		}
	}
}