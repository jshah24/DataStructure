import java.util.*;
public class ZigZagPattern {
	
	public static void pattern(int arr[]){
		boolean flag=true;
		for(int i=0;i<arr.length-2;i++){
		if(flag==true)
		{
			if(arr[i]>arr[i+1])
				swap(arr,i,i+1);
			else 
				{if(arr[i]<arr[i+1])
					swap(arr,i,i+1);
				}
				
		}
		flag=false;
	}
	}
	
	public static void swap(int a[],int i,int j)
	{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
			
			int[] src = {4, 3, 7, 8, 6, 2, 1}; 
			System.out.println("INPUT: "  + Arrays.toString(src)); 
			ZigZagPattern.pattern(src);
			System.out.println("OUTPUT: " + Arrays.toString(src)); 

		}

	}


