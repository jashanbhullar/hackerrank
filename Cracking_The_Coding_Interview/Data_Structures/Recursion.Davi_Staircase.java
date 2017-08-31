import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++){
			System.out.println(count(Integer.parseInt(in.readLine())));
		}
	}
	public static int count(int n){
        int[] array = new int[n];
        if (n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        else if(n == 3) {
            return 4;
        }
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for (int i = 3; i < n; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }
        return array[array.length-1];
	}
}