
public class MultiplicationOfLargeThree {
	
	public static void multiplication(int arr[]){
	int len=arr.length;
	int first,second,third,fourth;
	first=0;second=0;third=0;fourth=0;
	for(int n:arr)
{
	if(first<n){
		second=first;
		first=n;
	} else if(second<n)
	{
		third=second;
		second=n;
	}
}
	System.out.println(first*second);
	
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={2,3,5,7,8,12,14};
multiplication(arr);
	}

}
