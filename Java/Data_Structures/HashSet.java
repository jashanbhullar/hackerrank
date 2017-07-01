import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

 public static void main(String[] args)
 	 {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> hs = new HashSet<String>();
        for(int i=0;i<t;i++)
        {
        	String str = pair_left[i]+" "+pair_right[i];
        	hs.add(str);
        	System.out.println(hs.size());
        }
    }
}