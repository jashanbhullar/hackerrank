import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int a = Integer.parseInt(tk.nextToken());
		int b = Integer.parseInt(tk.nextToken());
		int c = Integer.parseInt(tk.nextToken());
		int [] st1 = input(in.readLine(),a);
		int [] st2 = input(in.readLine(),b);
		int [] st3 = input(in.readLine(),c);

		int ans = 0;
		while(true){
			if(st1[a] == st2[b] && st1[a] == st3[c]){
				ans = st1[a];
				break;
			}
			int min = Math.min(st1[a],st2[b]);
			min = Math.min(min,st3[c]);
			if(st1[a] > min)
				a--;
			if(st2[b] > min)
				b--;
			if(st3[c] > min)
				c--;
		}
		System.out.println(ans);
	}
	static int[] input(String input, int n){
		int ar [] = new int[n+1];
		String [] str = input.split(" ");
		for(int i=1;i<=n;i++){
			ar[i] = ar[i-1] + Integer.parseInt(str[n-i]); 
		}
		/*
		for(int ob : ar)
			System.out.print(ob+" ");
		System.out.println();
		*/
		return ar;
	}
}