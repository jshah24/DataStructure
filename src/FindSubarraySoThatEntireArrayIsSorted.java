public class FindSubarraySoThatEntireArrayIsSorted {
	
	public static void subarray(int arr[]){
		int left=0;
		int right=arr.length-1;
		int len=arr.length;
		
		for(left=0;left<len-1;left++)
		{
			if(arr[left]>arr[left+1])
				break;
		}
		if(left==len-1) return;
		for(right=len-1;right>0;right--)
		{
			if(arr[right]<arr[right-1])
				break;
		}
		if(right==0) return;
		
		int min=arr[left];
		int max=arr[left];
		
		for(int i=left+1;i<=right;i++)
		{
			if(arr[i]<min) min=arr[i];
			if(arr[i]>max) max=arr[i];
		}
		for(int i=0;i<left;i++)
		{
			if(arr[i]>min)
			{
				left=i;
			break;
			}
		}
		for(int i=len-1;i>=right+1;i--)
		{
			if(arr[i]<max)
			{
				right=i;
			break;
			}
		}
		System.out.println("index between"+left+" "+right);
		
		return;
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//FindSubarraySoThatEntireArrayIsSorted s=new FindSubarraySoThatEntireArrayIsSorted();
		int a[]={10,12,20,30,25,40,32,31,35,50,60};
		subarray(a);
		

	}

}
