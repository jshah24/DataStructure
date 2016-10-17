import java.io.*;
public class KthLargestElement {
	
	public static void swap(int arr[],int left, int right)
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	
	public static int partition(int arr[],int left,int right, int pivot)
	{
		int pivotvalue=arr[pivot];
		swap(arr,pivotvalue,right);
		int storepos=left;
		for(int i=left;i<right;i++)
		{
			if(arr[i]>pivot)
			{
				swap(arr,i,storepos);
				storepos++;
			}
		}
		swap(arr,storepos,right);
		return storepos;
	}
	
	public  static int kthlargest(int arr[],int k)
	{
		int left=0;
		int right=arr.length-1;
		while(true)
		{
			int pivindex=(left+right)/2;
			int newpiv=partition(arr,left,right,pivindex);
			if(newpiv==k)
				return arr[newpiv];
			else if(newpiv<k)
			{
				left=newpiv+1;
			}
			else
			{
				right=newpiv-1;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//KthLargestElement kl=new KthLargestElement();
		int arr[]={1,4,6,10,8,12,9};
		int k=2;
		System.out.println(kthlargest(arr,k));

	}

}
