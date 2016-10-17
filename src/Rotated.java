import java.util.*;
public class Rotated {
	public static void main(String []args){

	int[] a={3,4,5,1,2};
	int value=2;
	int left=0;
	int right=a.length-1;
	int mid;
	while(left<=right){
	mid=(left+right)/2;
	
	if(a[mid]==value)
	{
		System.out.println("FOund at"+mid);
		System.exit(0);
	
	}
	else if(value<a[mid])
		{
			if(value<a[left]){
			left=mid+1;
		}
			else{
				right=mid-1;
			}
		}
		else if(value>a[mid]){
			if(value>a[right]){
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
	
	
}
} 
}
}
	


