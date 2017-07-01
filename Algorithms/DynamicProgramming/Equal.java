import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Data
{
	private int value;
	private int occ;
	Data(int value)
	{
		this.value=value;
		this.occ=1;
	}
	public void addOcc()
	{
		occ++;
	}
	public int getValue()
	{
		return this.value;
	}
	public int getOcc()
	{
		return this.occ;
	}
	public void addValue(int sum)
	{
		this.value += sum;
	}
}
class Sorting implements Comparator <Data>
{
	public int compare(Data a,Data b)
	{
		return a.getValue()-b.getValue();
	}
}
class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for(int i=0;i<t;i++)
		{
			int n = Integer.parseInt(in.readLine());
			StringTokenizer tk = new StringTokenizer(in.readLine());
			ArrayList<Data> al = new ArrayList<>();
			for(int j=0;j<n;j++)
			{
				int value = Integer.parseInt(tk.nextToken());
				int flag=0;
				for(int k=0;k<al.size();k++)
				{
					if(al.get(k).getValue()==value)
					{
						al.get(k).addOcc();
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					Data temp = new Data(value);
					al.add(temp);
				}
			}
			Collections.sort(al,new Sorting());
			for(Data ob : al)
			{
				System.out.println(ob.getValue()+" "+ob.getOcc());
			}
			int oper=0;
			int itr=al.size()-1;
			for(int j=0;j<itr;j++)
			{
				Data a=al.get(0);
				Data b=al.get(1);
				int diff = b.getValue()-a.getValue();
				int sum=0;
				if(diff/5>0)
				{
					int oneTime=diff/5;
					sum += oneTime*5;
					diff -= oneTime*5;
					oper += oneTime*b.getOcc();
					System.out.println("Ran Op 5");
				}
				if(diff/2>0)
				{
					int oneTime=diff/2;
					sum += oneTime*2;
					diff -= oneTime*2;
					oper += oneTime*b.getOcc();
					System.out.println("Ran Op 2");	
				}
				if(diff!=0)
				{
					int oneTime = diff;
					sum += oneTime;
					diff -= oneTime;
					oper += oneTime*b.getOcc();
					System.out.println("Ran Op 1");
				}
				System.out.println("Iteration  :"+j);
				System.out.println("Difference :"+diff);
				System.out.println("Operations :"+oper);
				System.out.println("Sum        : "+sum);
				al.remove(0);
				for(int k=1;k<al.size();k++)
				{
					al.get(k).addValue(sum);
				}
				for(Data ob : al)
				{	
					System.out.println(ob.getValue()+" "+ob.getOcc());
				}
			}
			System.out.println(oper);
		}
	}
}