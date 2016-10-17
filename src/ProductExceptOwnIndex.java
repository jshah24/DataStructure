
public class ProductExceptOwnIndex {
	
	public static void product(int arr[])
	{
		int z=1;
		for(int i=0;i<arr.length;i++)
		{
			 z=z*arr[i];
		}
		
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=z/arr[j];
			System.out.println(arr[j]);
		}

	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int a[]={5,4,2,1};
		product(a);

	}

}
