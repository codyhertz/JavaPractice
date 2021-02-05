
public class StringEquality
{
	public static void main(String[] args)
	{
		String s1 = "jimmy";
		String s2 = s1;
		String s3 = new String("jimmy");
		
		System.out.println("==: s1 to s2, then s1 to s3, then s2 to s3: " + (s1 == s2) + " " + (s1 == s3) + " " + (s2 == s3));
		
		System.out.println(".equals: s1 to s2, then s1 to s3, then s2 to s3: " + (s1.equals(s2)) + " " + (s1.equals(s3)) + " " + (s2.equals(s3)));
	}
}
