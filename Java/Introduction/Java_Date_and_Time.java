import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

class Solution 
{
	public static void main(String ... ags)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		Calendar cal=Calendar.getInstance();
		int month = Integer.parseInt(tk.nextToken());
		int day = Integer.parseInt(tk.nextToken());
		int year = Integer.parseInt(tk.nextToken());
		String input_date=day+"/"+month+"/"+year;
		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		Date dt1=format1.parse(input_date);
		DateFormat format2=new SimpleDateFormat("EEEE"); 
		String finalDay=format2.format(dt1);
		System.out.println(finalDay.toUpperCase());
	}
}