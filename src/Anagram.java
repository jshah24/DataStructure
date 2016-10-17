import java.util.*;
public class Anagram {

	public static void main(String args[])
	{
		String s1="pot";
		String s2="huj";
		boolean isAna = isAnagram(s1,s2);
		if(isAna)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
	
	public static boolean isAnagram(String s1, String s2){
		char[] string1=s1.toCharArray();
		char[] string2=s2.toCharArray();
		boolean flag = false;
		HashMap<Character,Integer> h= new HashMap<Character,Integer>();
		
		for(char a:string1)
		{
			if (h.containsKey(a)) {
				int oldValue = h.get(a);
				int newValue = oldValue+1;
				h.remove(a);
				h.put(a, newValue);
			} else {
				h.put(a, 1);
			}
		}
		
		for(char a: string2){
			if(h.containsKey(a)){
				int value = h.get(a);
				int newValue = value-1;
				if(newValue>0){
					h.put(a, newValue);
				}
				else if(newValue==0){
					h.remove(a);
				}
			}
			else{
				flag= false;
			}
		}
		if(h.isEmpty()){
			flag = true;
		}
			
	return flag;	
		
	}
}
