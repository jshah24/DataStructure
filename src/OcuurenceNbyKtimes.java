import java.security.KeyStore.Entry;
import java.util.HashMap;


public class OcuurenceNbyKtimes {
	

	public static void main(String args[]){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int[] a={8,8,8,5,5,5,1,2,8,8,8,8};
		int i=0;
		int k=3;
		int n=a.length;
		
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
		for (Map.Entry<Integer,Integer> entry: h.entrySet()) {
		        if (entry.getValue()>n/k) {
		            System.out.println(entry.getKey());
		        }
		    }
		
		
	
		}
		
	}

}
