import java.util.*;
public class LongestSubstringWithoutRepeatitionofCharacter {
	
	
	public int longest(char[] str){
		int max=-1;
		int length=0;
		int start=0;
		Set<Character> h=new HashSet<Character>();
		
		for(int i=0;i<str.length;i++){
			if(h.contains(str[i])){
				if(length>max){
					max=length;
				}
				do{
					h.remove(str[start]);
					start++;
					length--;
				}while(str[start-1]!=str[i]);
			}
		
		h.add(str[i]);
		length++;
		}
		return Math.max(length, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LongestSubstringWithoutRepeatitionofCharacter l=new LongestSubstringWithoutRepeatitionofCharacter();
System.out.println(l.longest("GEEKZSFORGEEKS.".toCharArray()));
	}

}
