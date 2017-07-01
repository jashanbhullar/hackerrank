import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Excpetion {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(in.readLine());
        int n = Integer.parseInt(in.readLine());
        StringTokenizer tk = new StringTokenizer(in.readLine());
        int curr=0;
        for(int i=0;i<n;i++)
        {
        	curr = Integer.parseInt(in.readLine());
        	if(curr==val)
        	{
        		curr=i;
        		break;
        	}
        }
        System.out.println(curr);
    }
}