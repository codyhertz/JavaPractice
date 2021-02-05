public class CountWords
{
	public static int countWords(String s1)
	{
		return s1.split(" ").length;
	}
	
	public static void main(String[] args)
	{
		String s1 = "this is a test string woo";
		
		System.out.println(s1 + " has " + countWords(s1) + " words.");
	}
}
