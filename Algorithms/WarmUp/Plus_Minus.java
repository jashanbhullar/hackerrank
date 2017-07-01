import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int arr[] = new int[(int)n];
        double pos=0;
        double neg=0;
        double zer=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
                pos++;
            else if(arr[arr_i]<0)
                neg++;
            else 
                zer++;
        }
        double res=0;
        res=pos/n;
        System.out.printf("%f%n",res);
        res=neg/n;
        System.out.printf("%f%n",res);
        res=zer/n;
        System.out.printf("%f%n",res);
    }
}
