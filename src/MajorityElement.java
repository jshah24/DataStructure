	import java.util.HashMap;
import java.util.*;

public class MajorityElement {
	
		public static void main(String []args)
		{
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			int[] a={8,8,8,5,5,5,1,2,8,8,8,8};
			int i=0;	
			
			for(i=0;i<a.length;i++)
			{   
		
				
				if(map.get(a[i])==null)
				{
					map.put(a[i], 1);
				}
				else
				{	
					int frequency=map.get(a[i]);
					
				
					map.put(a[i],frequency+1);

				}
				
			
			
			if(map.get(a)>=a.length/2)
			{
				
			System.out.println(map.get(a));
		}
			}
	}





}
