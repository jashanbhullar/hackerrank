import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long sum=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            sum=sum+arr[arr_i];
            if(arr[arr_i]>max)
                max=arr[arr_i];
            if(arr[arr_i]<min)
                min=arr[arr_i];
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}
