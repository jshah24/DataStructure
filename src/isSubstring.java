
public class isSubstring {

	public static void main(String args[])
	{
		String s1="jinisha";
		String s2="waterbottle";
		String s3=s1+s1;
		System.out.println(s3);
		
		if(s3.toLowerCase().contains(s2.toLowerCase()))
		{
			System.out.println("Rotated string present");
		}
		else
		{
			System.out.println("Rotated string not present");
		}
		
	}
}
