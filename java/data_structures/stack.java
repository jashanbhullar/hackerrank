import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Stack;

class Solution
{
	public static void main(String ... ags)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=in.readLine())!=null)
		{
			Stack<Character> st = new Stack<Character>();
			for(int i=0;i<str.length();i++)
			{
				char c =str.charAt(i);
				if(st.empty())
					st.push(c);
				else
				{
					switch(c)
					{
						case ']':
									if(st.peek()=='[')
										st.pop();
									break;
						case '}':
									if(st.peek()=='{')
										st.pop();
									break;
									
						case ')':
									if(st.peek()=='(')
										st.pop();
									break;
									
						default : 
									st.push(c);
									break;
					}
				}

				//System.out.println(st.toString());
			}
			System.out.println(st.empty());
		}
	}
}