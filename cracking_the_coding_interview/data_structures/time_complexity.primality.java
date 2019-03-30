import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++){
			String ans = isPrime(Integer.parseInt(in.readLine())) ? "Prime" : "Not prime";
			System.out.println(ans);
		}
	}
	public static boolean isPrime(int val){
		if(val == 1)
			return false;
		int n = (int)Math.sqrt(val);
		for(int i=2;i<=n;i++){
			if(val%i == 0)
				return false;
		}
		return true;
	}
}