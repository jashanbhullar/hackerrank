import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int [] ar = new int[n];
		for(int i=0;i<n;i++)
			ar[i] = Integer.parseInt(tk.nextToken());
		int sum = 0;
		for(int i=0;i<n;i++){
			int val = 0;
			for(int j=0;j<n-1;j++){
				if(ar[j] > ar[j+1]){
					val++;
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
			if(val == 0)
				break;
			sum += val;
		}
		System.out.println("Array is sorted in "+sum+" swaps.");
		System.out.println("First Element: "+ar[0]);
		System.out.println("Last Element: "+ar[n-1]);
	}
}