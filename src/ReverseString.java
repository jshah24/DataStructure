
import java.util.*;
public class ReverseString {
	 public static void main(String[] args) 
	 {
		 String s1="Hello How Are You";
		 char[] a= s1.toCharArray();
		 char temp;
		 int start=0;
		 int end=a.length-1;
		 for(start=0;start<end;start++,end--)
		 {
			 temp=a[start];
			 a[start]=a[end];
			 a[end]=temp;
		 }
		 for(char ch:a)
		 {
			 System.out.println(ch);
			 
	 }

}
}



