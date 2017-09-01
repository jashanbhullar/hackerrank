import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int [][] ar = new int[6][6];
		for(int i=0;i<6;i++){
			StringTokenizer tk = new StringTokenizer(in.readLine());
			for(int j=0;j<6;j++){
				ar[i][j] = Integer.parseInt(tk.nextToken());
			}
		}
		int max = -64;
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				int sum = ar[i][j];
				sum += ar[i-1][j];
				sum += ar[i+1][j];
				sum += ar[i-1][j-1];
				sum += ar[i+1][j+1];
				sum += ar[i+1][j-1];
				sum += ar[i-1][j+1];
				max = Math.max(max,sum);
			}
		}
		System.out.println(max);
	}
}