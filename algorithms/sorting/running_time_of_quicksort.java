import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    int[] arrForIS = new int[n];
    int[] arrForQS = new int[n];
    for(int i = 0; i < n; i++)
    {
      arrForIS[i] = in.nextInt();
      arrForQS[i] = arrForIS[i];
    }
      
    int numShifts = shiftCount(arrForIS);
    int numSwaps = swapCount(arrForQS);
    
    System.out.println(numShifts - numSwaps);
  }
  
  private static int shiftCount(int[] array)
  {
    int count = 0;
    for(int i = 1; i < array.length; i++)
    {
      int j = i - 1;
      int key = array[i];
      
      while(j >= 0 && array[j] > key)
      {
        array[j+1] = array[j];
        count++;
        
        j--;
      }
      array[j+1] = key;
    }
    
    return count;
  }
  
  static int swapCountQS = 0;
  private static int swapCount(int[] array)
  {
    quickSort(array,0,array.length-1);
    return swapCountQS;
  }
  
  private static void quickSort(int[] array, int low, int high)
  {
    if(low < high)
    {
      int splitPos = partition(array,low,high);
      
      quickSort(array,low,splitPos-1);
      quickSort(array,splitPos+1,high);
    }
  }
  
  private static int partition(int[] array, int low, int high)
  {
    int pivot = array[high];
    int i = low - 1;
    
    for(int j = low; j < high; j++)
    {
      if(array[j] <= pivot)
      {
        i++;
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
        swapCountQS++;
      }
    }
    
    int temp = array[i+1];
    array[i+1] = array[high];
    array[high] = temp;
    
    swapCountQS++;
    
    return i + 1;
  }
}