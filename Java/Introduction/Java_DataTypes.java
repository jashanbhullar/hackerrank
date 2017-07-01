import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Solution
{

    public static void main(String []argh)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for(int i=0;i<n;i++)
        {
            String str= in.readLine();
            try
            {
                long x = Long.parseLong(str);
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-32768 && x<=32767)
                {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");   
                }
                else if(x>=-2147483648 && x<=2147483647)
                {
                    System.out.println("* int");
                    System.out.println("* long");   
                }
                else 
                {
                    System.out.println("* long");   
                }

            }
            catch(NumberFormatException e)
            {
                System.out.println(str+" can't be fitted anywhere.");
            }

        }
    }
}
