import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		for(int t=0;t<test;t++){
			int cost = Integer.parseInt(in.readLine());
			int n = Integer.parseInt(in.readLine());
			StringTokenizer tk = new StringTokenizer(in.readLine());
			HashMap<Integer,Integer> hm = new HashMap<>();
			for(int i=0;i<n;i++){
				int val = Integer.parseInt(tk.nextToken());
				if(hm.containsKey(cost-val)){
					i++;
					System.out.println(hm.get(cost-val)+1+" "+i);
					break;
				}
				hm.put(val,i);
			}
		}
	}
}