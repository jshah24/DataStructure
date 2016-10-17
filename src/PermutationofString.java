import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PermutationofString {
	public static void main(String args[])
	{	String chr = "jinisha";
		String chr1="ashinij";
		char[] charArray1=chr1.toCharArray();
		char[] charArray = chr.toCharArray();
		List<Character> listC1=new ArrayList<Character>();
		 List<Character> listC = new ArrayList<Character>();
		    for (char c : charArray) {
		        listC.add(c);
		    }
			Collections.sort(listC);
			System.out.println("Answer: "+ listC);
			for(char c1:charArray1)
			{
				listC1.add(c1);
			}
			Collections.sort(listC1);
			System.out.println("Answer"+ listC1);
			
			if(listC != null && listC1 != null){
	            listC.removeAll(listC1);
	            if(listC.isEmpty()){
	                System.out.println("Both list are same.");
	            }
	            else{
	                System.out.println("Both list are not same");
	            }
	        }
	}

}
