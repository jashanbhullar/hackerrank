import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

class Solution 
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double pay =Double.parseDouble(in.readLine());

		NumberFormat nf = null;
		String str;

		//For US 
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		str=nf.format(pay);
		System.out.println("US: "+str);

		//For India
		Locale india = new Locale("en","IN");
		nf = NumberFormat.getCurrencyInstance(india);
		str=nf.format(pay);
		System.out.println("India: "+str);

		//For China
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		str=nf.format(pay);
		System.out.println("China: "+str);

		//For France
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		str=nf.format(pay);
		System.out.println("France: "+str);	
	}
}