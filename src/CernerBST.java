import java.util.*;
import java.io.*;
public class CernerBST {

	public static void main(String args[])
	{
		System.out.println("Enter the string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
		String s=br.readLine();
		
		char[] charArray=s.toCharArray();
	    List<Character> listC = new ArrayList<Character>();
	    for (char c : charArray) {
	        listC.add(c);
	    }
		Collections.sort(listC);
		System.out.println("Answer: "+ listC);
		
	}
		catch(Exception e)
		{
			}
	}
}
