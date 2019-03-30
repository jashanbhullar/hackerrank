import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

class Display
{
	void display(double volume)
	{
		System.out.printf("%.3f",volume);
	}
}
class Calculate
{
	public Display output = new Display();
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int get_int_val()throws NumberFormatException,IOException
	{
		int var = Integer.parseInt(in.readLine());
		if(var<=0)
			throw new NumberFormatException("All the values must be postive");
		return var;
		
	}
	double get_double_val()throws NumberFormatException,IOException
	{
		double var = Double.parseDouble(in.readLine());
		if(var<=0)
			throw new NumberFormatException("All the values must be postive");
		return var;

	}
	static Calculate do_calc()
	{
		Calculate var = new Calculate();
		return var;
	}
	double get_volume(int a)
	{
		return a*a*a;
	}
	double get_volume(int l,int b,int h)
	{
		return l*b*h;
	}
	double get_volume(double r)
	{
		return 2*(Math.PI*r*r*r)/3;
	}
	double get_volume(double r,double h)
	{
		return Math.PI*r*r*h;
	}
	void display(double volume)
	{
		System.out.printf("%.3f",volume);
	}
}







class Solution {

 public static void main(String[] args) {
   DoNotTerminate.forbidExit();
   try {
    Calculate cal = new Calculate();
    int T = cal.get_int_val();
    while (T--> 0) {
     double volume = 0.0;
     int ch = cal.get_int_val();
     if (ch == 1) {
      int a = cal.get_int_val();
      volume = Calculate.do_calc().get_volume(a);
     } else if (ch == 2) {
      int l = cal.get_int_val();
      int b = cal.get_int_val();
      int h = cal.get_int_val();
      volume = Calculate.do_calc().get_volume(l, b, h);

     } else if (ch == 3) {
      double r = cal.get_double_val();
      volume = Calculate.do_calc().get_volume(r);

     } else if (ch == 4) {
      double r = cal.get_double_val();
      double h = cal.get_double_val();
      volume = Calculate.do_calc().get_volume(r, h);

     }
     cal.output.display(volume);
    }

   } catch (NumberFormatException e) {
    System.out.print(e);
   } catch (IOException e) {
    e.printStackTrace();
   } catch (DoNotTerminate.ExitTrappedException e) {
    System.out.println("Unsuccessful Termination!!");
   }


  } //end of main
} //end of Solution

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {}

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
} 