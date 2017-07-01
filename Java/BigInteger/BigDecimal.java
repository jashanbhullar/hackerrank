import java.math.BigDecimal;
import java.util.*;

class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

		for(int i =n-1; i>=0;i--)
		{
		    for(int j =1; j<=i;j++)
		    {
		        BigDecimal a = new BigDecimal(s[j]);
		        BigDecimal b = new BigDecimal(s[j-1]);
		        if(b.compareTo(a) < 0)
		        {
		            String temp = s[j-1];
		            s[j-1] = s[j];
		            s[j] = temp;
		    	}
		    }
		}

      	//Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}