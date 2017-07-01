import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuffer str = new StringBuffer();
        for(int i=0;i<n;i++)
            str.append(" ");
        for(int i=n;i>0;i--){
    		str.setCharAt(i-1,'#');
    		System.out.println(str);
        }
    }
}
