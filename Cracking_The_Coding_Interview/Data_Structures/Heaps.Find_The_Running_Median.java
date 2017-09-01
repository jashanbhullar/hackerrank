import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ArrayList<Float> al = new ArrayList<>();
		for(int i=0;i<n;i++){
			float val = Float.parseFloat(in.readLine());
			/*
				Add the al.add(index , val) here 
				Don't know how?
				
			*/
			System.out.format("%.1f%n",getMedian(al));
		}
	}
	public static float getMedian(ArrayList<Float> al){
		if(al.size() == 1)
			return al.get(0);
		else if(al.size() == 2)
			return (al.get(0)+al.get(1))/2;
		else if(al.size()%2 == 0){
			float a = al.get(al.size()/2);
			float b = al.get((al.size()/2)-1);
			return (a+b)/2;
		}
		return al.get(al.size()/2);
	}
}