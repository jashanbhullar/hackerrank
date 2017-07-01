import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(tk.nextToken());
		int count = 0;
    	for (int i = 0; i < n; i++) 
    	{
        	int sum = 0;
        	for (int j = i; j < n; j++)
        	{
            	sum += arr[j];
            	if (sum < 0) 
            	{
                	count++;
            	}
     	    }
    	}
    	System.out.println(count);
	}
}