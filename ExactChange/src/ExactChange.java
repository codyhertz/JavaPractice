
public class ExactChange
{
	public static boolean exact(int nickles, int pennies, int sum)
	{
		int total = nickles * 5;
		
		if(total < sum)
		{
			total = sum - total;
			
			if(total > pennies)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			total = sum % 5;
			total *= 5;
			total = sum - total;
			
			if(total > pennies)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(exact(0, 7, 12));
	}
}
