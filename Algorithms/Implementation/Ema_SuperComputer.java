import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Plus
{
	public int x;
	public int y;
	public int val;
	Plus(int x,int y,int val)
	{
		this.x = x;
		this.y = y;
		this.val = val;
	}
}
class Solution
{
	static int n = 0;
	static int m = 0;
	static ArrayList<Plus> al = new ArrayList<>();
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		n = Integer.parseInt(tk.nextToken());
		m = Integer.parseInt(tk.nextToken());
		boolean [][] arr = new boolean[n][m];
		for(int i=0;i<n;i++)
		{
			String str = in.readLine();
			for(int j=0;j<m;j++)
				arr[i][j] = str.charAt(j) == 'G' ? true : false ;
		}
		//Solution.display(arr);
		Solution.findPlus(arr);
		//Solution.display();
		int res = 0;
		for(int i=0;i<al.size()-1;i++)
		{
			Plus alpha = al.get(i);
			for(int j=i+1;j<al.size();j++)
			{
				Plus beta = al.get(j);
				if(Solution.check(alpha,beta))
				{
					int a = alpha.val * 4 + 1;
					int b = beta.val * 4 + 1;
					res = Math.max(res,a*b);
				}
			}
		}
		System.out.println(res);
	}
	public static boolean check(Plus alpha,Plus beta)
	{
		boolean [][] arr = new boolean[n][m];
		int x = alpha.x;
		int y = alpha.y;
		int val = alpha.val;
		arr[x][y] = true;
		for(int i=1;i<=val;i++)
		{
			arr[x-i][y] = true;
			arr[x+i][y] = true;
			arr[x][y-i] = true;
			arr[x][y+i] = true;
		}
		x = beta.x;
		y = beta.y;
		val = beta.val;
		if(arr[x][y])
			return false;
		for(int i=1;i<=val;i++)
		{
			if(arr[x-i][y])
				return false;
			if(arr[x+i][y])
				return false;
			if(arr[x][y-i])
				return false;
			if(arr[x][y+i])
				return false;
		}
		return true;

	}
	public static void display(boolean [][] arr)
	{
		for(boolean[] ob : arr)
		{
			for(boolean ab : ob)
			{
				int i = ab ? 1 : 0;
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void display()
	{
		for(Plus ob : al)
		{	
			System.out.println(ob.x+" , "+ob.y+" : "+ob.val);
		}
	}
	public static void findPlus(boolean [][] arr)
	{
		int max = 0;
		int x = 0;
		int y = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j])
				{
					int val = 0;
					while(true)
					{
						val++;
						try
						{
							if(!arr[i-val][j])
								break;
							if(!arr[i+val][j])
								break;
							if(!arr[i][j+val])
								break;
							if(!arr[i][j-val])
								break;
						}catch(Exception e)
						{
							break;
						}
					}
					val--;
					for(int k=0;k<=val;k++)
					{
						Plus temp = new Plus(i,j,k);
						al.add(temp);
					}
				}
			}
		}
	}
}