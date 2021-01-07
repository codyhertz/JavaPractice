
public class LastWordLength
{
	public static void main(String[] args)
	{
		String str = "test test testing";
		String[] split = str.split(" ");
		
		System.out.println("The length of the last word in: " + str + " is " + split[split.length - 1].length());
	}
}
