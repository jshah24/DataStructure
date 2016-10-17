import java.util.*;
import java.util.Map.Entry;

public class DetermineUniqueCharaterInString {
	public static void main(String args[])
	{
		
		

		    /*
		        boolean flag=false;
		        String inputstring="Jinisha";
		      
		        HashSet < Character> set= new HashSet();
		        for(int i=0;i < inputstring.length();i++)
		        {
		            flag=set.add(inputstring.charAt(i));
		            if (flag == false)
		           break;
		        }
		    System.out.println(flag); 
		*/
	String str = "abcdshe";
	System.out.println(str.substring(0, 1));
	char[] charr = str.toCharArray();
	Character ch;
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	for(int i=0;i<charr.length;i++)
	{	
		ch=str.charAt(i);
		if(hm.containsKey(ch))
		{
			hm.put(ch, hm.get(ch)+1);
		}
		else
		{
			hm.put(ch, 1);
		}
	}
	for(Map.Entry<Character, Integer> entry : hm.entrySet())
	{
		if(entry.getValue()==1)
		{
			System.out.println("unique");
		}
		else
		{
			System.out.println("non unique");
		}
	}
    
	
	}


}