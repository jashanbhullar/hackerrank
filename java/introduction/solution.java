import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static boolean flag=true;
	static int B=0;
	static int H=0;
	static 
	{
		try 
			{
				B=Integer.parseInt(in.readLine());
				H=Integer.parseInt(in.readLine());
				if(B<1 || H<1)
				{
					throw new Exception("e");
				}
			}
			catch(Exception e)
			{
				flag=false;
				System.out.println("java.lang.Exception: Beadth and height must be positive");
			}
	}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class