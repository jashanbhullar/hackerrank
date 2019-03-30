import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int q = Integer.parseInt(tk.nextToken());
		ArrayList<ArrayList<Integer>> al = new ArrayList<>(n);
		//System.out.println(al.size());
		for(int i=0;i<n;i++){
			ArrayList<Integer> temp = new ArrayList<>();
			al.add(temp);
		}
		int val = 0;
		for(int i=0;i<q;i++){
			tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int x = Integer.parseInt(tk.nextToken());
			int y = Integer.parseInt(tk.nextToken());
			if(a == 1){
				int index = ((x^val)%n);
				al.get(index).add(y); 
			}
			else{
				int index = ((x^val)%n);
				ArrayList<Integer> temp = al.get(index);
				index = y%temp.size();
				val = temp.get(index);
				System.out.println(val);
			}
		}
	}
}