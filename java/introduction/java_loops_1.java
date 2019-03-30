import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
	public static void main(String ... ags)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for(int i=1 ;i <11 ;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        } 
	}
}