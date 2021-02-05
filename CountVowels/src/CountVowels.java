
public class CountVowels
{
	public static int countVowels(String s1)
	{
		String vowels = "aeiou";
		int count = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(vowels.indexOf(s1.charAt(i)) != -1)
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		String s1 = "this is a test string woo";
		
		System.out.println(s1 + " has " + countVowels(s1) + " vowels.");
	}
}
