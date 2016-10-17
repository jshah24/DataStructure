import java.util.HashSet;


public class DuplicatewithKdistance {
	
	public static boolean duplicate(int arr[],int k){
		HashSet<Integer> h=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(h.contains(arr[i])){
				return true;
			}
			if(i>=k)
			{
				h.remove(arr[i-k]);
				}
			h.add(arr[i]);
		
		}
		return false;
		
		
	}
	
	public static void main(String args[]){
		int arr[]={1,2,3,11,2,5,7};
		int k=7;
		DuplicatewithKdistance d=new DuplicatewithKdistance();
		
		System.out.println(d.duplicate(arr,k));
	}
	
	

}
