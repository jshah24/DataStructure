import java.util.*;
public class MissingElementWithDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={2,3,1,7,4};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
	
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int i=max;i>0;i--)
		{
			if(!(ar.contains(i)))
			{
				System.out.println(i);
			}
		
		

	}
	}
}
