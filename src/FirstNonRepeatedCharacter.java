import java.util.HashMap;


public class FirstNonRepeatedCharacter {
	
	public static void main(String args[])
	{
		String s1="Total";
		char ch=FirstNonRepeated(s1);
		System.out.println("First Non Repeated character"+ch);
		
		
	}
		
		public static Character FirstNonRepeated(String s1)
		{
			char[] string1=s1.toCharArray();
			int length=s1.length();
			Character ch;
		LinkedHashMap<Character,Integer> h= new LinkedHashMap<Character,Integer>();
		
        for (int i=0;i < length;i++)
        {
            ch=s1.charAt(i);
            if(h.containsKey(ch))
            {
                
             h.put(  ch ,  h.get(ch) +1 );
            }
            else
            {
                h.put( ch , 1 ) ;
            }
        }
   
		for (int i=0;i<length;i++)
		{
			ch=s1.charAt(i);
			if(h.get(ch)==1)
			return ch;
		
		
	}
		
return null;
}



}