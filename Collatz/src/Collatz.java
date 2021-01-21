
public class Collatz
{
	public static void main(String[] args)
	{
		int num = 106;
		
		System.out.print(num + " ");
		
		while(num != 1)
		{
			if(num % 2 == 0)
			{
				num /= 2; 
			}
			else
			{
				num *= 3;
				num++;
			}
			
			System.out.print(num + " ");
		}
		
		
	}
}
