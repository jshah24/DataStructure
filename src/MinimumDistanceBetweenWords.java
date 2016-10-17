
public class MinimumDistanceBetweenWords {
	public static void main(String args[]){
		
		String s="the quick the word";
		String s1="the";
		String s2="the";
		Boolean flag1=false,flag2=false;
		int index1=Integer.MAX_VALUE;
		int index2=Integer.MAX_VALUE;
		int distance=Integer.MAX_VALUE;
		int result=Integer.MAX_VALUE;
		String[] arr=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(s1.equals(arr[i])&& flag1==false)
			{
				index1=i;
				flag1=true;
			}else
			if(s2.equals(arr[i])&& flag2==false)
			{
				index2=i;
				flag2=true;
			}
			if(index1!=Integer.MAX_VALUE && index2!=Integer.MAX_VALUE)
			{
				distance=Math.abs(index1-index2);
			}
			//if(distance<result)
			//{
				//result=distance;
			//}
		}
		if(distance==Integer.MAX_VALUE)
		{
			System.out.println("error");
		}
		else
		{
			System.out.println(distance);
		}
		
	}

}
