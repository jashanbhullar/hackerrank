import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char [] a = in.readLine().toCharArray();
		char [] b = in.readLine().toCharArray();
		int [] ar_a = new int[26];
		int [] ar_b = new int[26];	
		for(char ob : a){
			ar_a[(int)ob-97]++;
		}
		for(char ob : b){
			ar_b[(int)ob-97]++;
		}
		int res = 0;
		for(int i=0;i<26;i++){
			res += Math.abs(ar_a[i] - ar_b[i]);
		}
		System.out.println(res);
	}
}