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
		float b = Float.parseFloat(tk.nextToken());
		float a = Float.parseFloat(tk.nextToken());

		float c = (2*a)/b;
		int d = (int)c;
		if(c != d)
			d++;
		System.out.println(d);
	}
}