
public class MissingConsecutiveNumber {
	
	
	public Integer missing(int arr[])
	{
		int start=arr[0];
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==(mid+1+start) && mid-1>=0 && arr[mid-1]==(mid+start-1))
				{return mid+start;
		}
		
		else if ((mid+start)==arr[mid]){
			left=mid+1;
		}
		else{
			right=mid-1;
		}
	}
    return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MissingConsecutiveNumber m=new MissingConsecutiveNumber();
		int a1[]={2,3,4,5,6,7,8,9};
		int a2[]={-2,0,1,2,3,4,5};
		
	System.out.println(m.missing(a1));
	System.out.println(m.missing(a2));
		

	}

}
