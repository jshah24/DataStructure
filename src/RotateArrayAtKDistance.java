
public class RotateArrayAtKDistance {
	
	public static void  rotate(int arr[],int left,int right)
	{
		if(arr==null|| arr.length==1)
			return;
		
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void reverse(int arr[],int k)
	{
		k=k%arr.length;
		
	int a=arr.length-k;
	rotate(arr,0,a-1);
	rotate(arr,a,arr.length-1);
	rotate(arr,0,arr.length-1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8};
		int k=3;
		RotateArrayAtKDistance r=new RotateArrayAtKDistance();
	r.reverse(arr,k);
		
		
		

	}

}
