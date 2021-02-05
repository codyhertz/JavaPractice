
public class SumOfDigits
{
	public static int sumOfDigits(int num)
	{
		int sum = 0;
		String numString = String.valueOf(num);
		
		for(int i = 0; i < numString.length(); i++)
		{
			sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
		}
		
		return sum;
	}
	public static void main(String[] args)
	{
		int num = 23456345;
		
		System.out.println("The sum of the digits of " + num + " is " + + sumOfDigits(num));
	}
}
