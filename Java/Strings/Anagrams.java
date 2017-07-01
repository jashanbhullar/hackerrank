import java.io.*;
import java.util.*;

class Solution 
{
	static boolean isAnagram(String a,String b)
	{
		char [] arr = null;
    
        a = a.toLowerCase();
		arr = a.toCharArray();
		Arrays.sort(arr);
		a = new String(arr);
	
        b = b.toLowerCase();
        arr = b.toCharArray();
		Arrays.sort(arr);
		b = new String(arr);
        
        return a.contentEquals(b);
	}
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}