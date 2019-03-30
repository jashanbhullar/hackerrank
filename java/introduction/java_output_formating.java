import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class test
{
	public static void main(String ... ags)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("================================");
        for(int i=0;i<3;i++)
        {
        	StringTokenizer tk = new StringTokenizer(in.readLine());
        	String str = tk.nextToken();
        	int num = Integer.parseInt(tk.nextToken());
        	System.out.printf("%-15s",str);
            System.out.printf("%03d\n",num);
        }
        System.out.println("================================"); 
	}
}