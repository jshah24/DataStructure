import java.util.*;
import java.util.Map.Entry;
public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="total";
		char[] c=str.toCharArray();
		LinkedHashMap<Character,Integer> hm= new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<c.length;i++)
		{
			char ch=str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		for(Entry<Character,Integer> entry : hm.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
			}
		
		}
		

	}

}
