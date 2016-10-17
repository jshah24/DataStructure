import java.util.*;
public class IntersectionofTwoArrays {
	
	public int[] intersection(int a[],int b[])
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i:a)
		{
			if(!hm.containsKey(i))
			{
				hm.put(i, 1);
			}
			else
			{
				hm.put(i, hm.get(i)+1);
			}
		}
		
		for(int j:b)
		{
			if(hm.containsKey(j)&&hm.get(j)>0)
			{
				result.add(j);
			hm.put(j,hm.get(j)-1);
		}
		}
		int[] res=new int[result.size()];
		for(int k=0;k<res.length;k++)
		{
			res[k]=result.get(k);
		}
		return res;
	}
	

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		int a[]={0,1,1,2,2,5};
		int b[]={0,1,2,2,2,6};
		IntersectionofTwoArrays i=new IntersectionofTwoArrays();
		System.out.print(i.intersection(a, b));

	}

}
