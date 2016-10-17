import java.util.*;
public class LongestContigousArray {
	
	
	public static int longestConsecutive(int[] num) {
		if (num.length == 0) {
			return 0;
		}
	 
		Set<Integer> set = new HashSet<Integer>();
		int max = 1;
	 
		for (int e : num)
			set.add(e);
	 
		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			int count = 1;
			//System.out.println(left+" "+right);
	 
			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;
				System.out.println(left);
			}
	 
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
				System.out.println(right);
				}
	 
			max = Math.max(count, max);
		}
	 
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={100,2,5,1,3,4,6};
		
		System.out.println(longestConsecutive(a)); 

	}

}
