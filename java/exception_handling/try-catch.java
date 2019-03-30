import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;


class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			int a = Integer.parseInt(in.readLine());
			int b = Integer.parseInt(in.readLine());
			if(b==0)
				throw new ArithmeticException("/ by zero");
			int res=a/b;
			System.out.println(res);
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.util.InputMismatchException");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}