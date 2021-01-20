package swapInts;

public class SwapInts
{
	public static void main(String[] args)
	{
		int x = 50;
		int y = 70;
		
		System.out.println("Values of x and y:" + x + " " + y);
		
		x += y;
		y = x - y;
		x -= y;
		
		System.out.println("Values of x and y:" + x + " " + y);
	}
}
