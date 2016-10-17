
public class AlternatePositiveAndNegative {
	public static void main(String args[])
	{
		int a[]={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		int pivot=0;
		int left=0;
		int right=a.length-1;
		
		while(left<right)
		{
			while(a[left]<0 && left<right)
				left++;
			while(a[right]>0&& left<right)
				right--;
			
			if(left<right)
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
			
		}
		left=1;
		int high=0;
		while(a[high]<0)
			high++;
		right=high;
		while(a[left]<0 && right<a.length)
		{
			int temp=a[left];
		    a[left]=a[right];
		    a[right]=temp;
		    left=left+2;
		    right++;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	
	
	
	
	
		
	}


