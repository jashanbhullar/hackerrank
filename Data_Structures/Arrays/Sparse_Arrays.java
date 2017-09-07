import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		HashMap<String,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++){
			String str = in.readLine();
			Integer val = hm.get(str);
			if(val == null)
				hm.put(str,1);
			else
				hm.put(str,val+1);
		}
		int q = Integer.parseInt(in.readLine());
		for(int i=0;i<q;i++){
			Integer val = hm.get(in.readLine());
			if(val == null)
				val = 0;
			System.out.println(val);
		}
	}
}