public class Divisibility
{
  public static void main(String[] args)
  {
    for(int i = 0; i < 100; i++)
    {
      if(i % 15 == 0)
      {
        System.out.println(i + " is divisible by both 3 and 5");
      }
      else if(i % 5 == 0)
      {
        System.out.println(i + " is divisible by both 5");
      }
      else if(i % 3 == 0)
      {
        System.out.println(i + " is divisible by both 3");
      }
    }
  }
}
