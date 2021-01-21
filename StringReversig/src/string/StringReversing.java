package string;
public class StringReversing
{
	public static String simpleMethod(String str)
	{
		StringBuilder newStr = new StringBuilder(str);
		return newStr.reverse().toString();
	}
	
	public static String manualMethod(String str)
	{
		StringBuilder newStr = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			newStr.append(str.charAt(i));
		}
		
		return newStr.toString();
	}
	
	public static String byWordMethod(String str)
	{
		StringBuilder newStr = new StringBuilder();
		String[] splitString = str.split(" ");
		
		for(int i = 0; i < splitString.length; i++)
		{
			newStr.append(simpleMethod(splitString[i]));
			if(i != splitString.length - 1)
			{
				newStr.append(" ");
			}
		}
		
		return newStr.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println("First method hello: " + simpleMethod("hello"));
		System.out.println("Second method hello: " + manualMethod("hello"));
		System.out.println("Third method hello world, i'm cody: " + byWordMethod("hello world, i'm cody!"));
	}
}
