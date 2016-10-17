
public class ConsecutiveElementInArray {

	
	public static boolean checkConsecutive(int arr[])
	{
		int  min=arr[0];
		int max=arr[0];
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<min){
			min=arr[i];
		}
		
	}
	//System.out.println(min);
	
	for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}
	if(arr.length!=max-min+1) return false;
	
	for(int i = 0;i<arr.length;i++){
		int x  = Math.abs(arr[i]);
		if(arr[x-1]>0){
			arr[x-1] = arr[x-1]*-1;
		}
		else{
			return false;
		}
	}
	return true;
	
	}
	
	public static void main(String args[]){
		int arr[]={5,2,3,4,1};
		
		ConsecutiveElementInArray c=new ConsecutiveElementInArray();
		System.out.println(c.checkConsecutive(arr));
	}
	
}
