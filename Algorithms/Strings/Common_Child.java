import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char [] a = in.readLine().toCharArray();
		char [] b = in.readLine().toCharArray();
		int [][] ar = new int[a.length+1][b.length+1];
		for(int i=0;i<=a.length;i++){
			for(int j=0;j<=b.length;j++){
				if(i==0 || j == 0)
					ar[i][j] = 0;
				else if(a[i-1] == b[j-1])
					ar[i][j] = ar[i-1][j-1]+1;
				else
					ar[i][j] = Math.max(ar[i-1][j],ar[i][j-1]);
			}
		}
		System.out.println(ar[a.length][b.length]);
	}
}