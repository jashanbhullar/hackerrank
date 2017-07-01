import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.security.MessageDigest;


class Solution
{
	public static void main(String ... ags)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		MessageDigest md5 = MessageDigest.getInstance("SHA-256");
		md5.update(in.readLine().getBytes());
		byte[] digest = md5.digest();
        for (byte b : digest)
        {
        	System.out.printf("%02x", b);
        }
	}
}