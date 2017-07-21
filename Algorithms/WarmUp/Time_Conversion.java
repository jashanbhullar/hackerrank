import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Yay

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer str = new StringBuffer(in.next());
        int h = Integer.parseInt(str.substring(0,2));
        //	System.out.println(str.charAt(8));
        if(str.charAt(8)=='A')
        {
        	if(h==12)
        		System.out.println("00"+str.substring(2,8));
        	else
        		System.out.println(str.substring(0,8));
        }
        else
        {
        	h=h+12;
        	if(h==24)
        		System.out.println("12"+str.substring(2,8));
        	else
        	{
        		System.out.print(h);
        		System.out.print(str.substring(2,8));
        	}
        }
    }
}
