import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex
{
	String pattern;
	MyRegex()
	{
		String str="(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
		this.pattern=str+"."+str+"."+str+"."+str;
	}
}