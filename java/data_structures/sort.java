import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class Solution implements Comparable<Solution>
{
	String name;
	int id;
	double cgpa;
	Solution(String name, int id,double cgpa)
	{
		this.name=name;
		this.id=id;
		this.cgpa=cgpa;
	}
	public String getName()
	{
		return this.name;
	}
	public int compareTo(Solution sol)
	{
		if(this.cgpa>sol.cgpa)
			return -1;
		else if(this.cgpa<sol.cgpa)
			return 1;
		if(this.name.compareTo(sol.name)>0)
			return 1;
		else if(this.name.compareTo(sol.name)<0)
			return -1;
		if(this.id>sol.id)
			return 1;
		else
			return -1;
	}

	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ArrayList<Solution> al = new ArrayList<Solution>();
		for(int i=0;i<n;i++)
		{
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int id = Integer.parseInt(tk.nextToken());
			String name = tk.nextToken();
			double cgpa = Double.parseDouble(tk.nextToken());
			Solution sol = new Solution(name,id,cgpa);
			al.add(sol);
		}
		Collections.sort(al);
		for(Solution sol : al)
		{
			System.out.println(sol.getName());
		}
	}
}