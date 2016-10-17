
import java.io.*;
public class SumofTwoElements {
	
	public static void sum(int arr[],int sum)
	{
		boolean[] binmap=new boolean[100];
		for(int i=0;i<arr.length;i++)
		{
			int temp=sum-arr[i];
			if(temp>=0 && binmap[temp])
			
			{
				System.out.println(arr[i]+ " "+temp);
			}
			binmap[arr[i]]=true;
			 
		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,4,45,6,10,8};
		int s=18;
		sum(arr,s);
		

	}

}

