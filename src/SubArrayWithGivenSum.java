
public class SubArrayWithGivenSum {
	public void findSubArray(int[] arrA, int Sum) {
		int currSum = 0;
		int start = 0;
		for (int i = 0; i <= arrA.length; i++) {

			while (currSum>Sum) {
				
				currSum=currSum-arrA[start++];
			
			}
  			if (currSum == Sum) {
				System.out.println(Sum + " is found between indexes " + start
						+ " and " + (i - 1));
				
				System.out.print("And Elements are : ");
				for (int j = start; j <= i - 1; j++) {
					System.out.print(" " + arrA[j]);
				}
				return;
			}
			if (i < arrA.length)
				currSum = currSum + arrA[i];
			
		}

		System.out.println("No subarray is found with sum equals to " + Sum);
	}

	public static void main(String[] args)  {
		int[] arrA = { 25, 12, 14, 22, 19, 15, 10, 23 };
		int Sum = 55;
		SubArrayWithGivenSum i = new SubArrayWithGivenSum();
		i.findSubArray(arrA, Sum);
	}

}
