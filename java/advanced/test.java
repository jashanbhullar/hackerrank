enum Color
{
	RED,GREEN
}
class Solution
{
	public static void main(String ... ags)
	{
		String str = "1";
		Color val = (str.equals("1"))? Color.GREEN : Color.RED;
		System.out.println(val);
	}
}