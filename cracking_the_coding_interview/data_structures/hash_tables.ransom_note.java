import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		if(m > n){
			System.out.println("No");
			System.exit(0);
		}
		HashMap<String,Integer> hm = new HashMap<>();
		tk = new StringTokenizer(in.readLine());
		while(tk.hasMoreTokens()){
			String str = tk.nextToken();
			Integer val = hm.get(str);
			if(val == null){
				hm.put(str,1);
			}
			else{
				hm.put(str,++val);
			}
		}
		tk = new StringTokenizer(in.readLine());
		String ans = "Yes";
		while(tk.hasMoreTokens()){
			String str = tk.nextToken();
			Integer val = hm.get(str);
			if(val == null || val < 1){
				ans = "No";
				break;
			}
			else if(val < 1){
				ans = "No";
				break;
			}
			else{
				hm.put(str,--val);
			}
		}
		System.out.println(ans);
	}
}