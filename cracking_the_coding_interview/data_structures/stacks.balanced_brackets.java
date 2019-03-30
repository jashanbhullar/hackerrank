import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++){
			String str = in.readLine();
			String ans = fun(str) ? "YES" : "NO";
			System.out.println(ans);
		}
	}
	public static boolean fun(String s){
		StringBuilder str = new StringBuilder(s);
		StringBuilder res = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(matches(ch,res)){
				res.deleteCharAt(res.length()-1);
				//System.out.println("Deleted");
			}	
			else{
				res.append(ch);
				//System.out.println("Added");
			}
		}
		//System.out.println(res);
		if(res.length()==0)
			return true;
		return false;
	}
	public static boolean matches(char ch, StringBuilder str){
		try{
			char m = str.charAt(str.length()-1);
			//System.out.println(m+" "+ch);
			if(ch == ')' && m =='(')
				return true;
			else if(ch == ']' && m =='[')
				return true;
			else if(ch == '}' && m =='{')
				return true;

		}catch(IndexOutOfBoundsException e){
			return false;
		}
		return false;
	}
}