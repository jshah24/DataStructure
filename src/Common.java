import java.util.*;
public class Common {
	

		public List<Integer> commonElements(int a1[], int a2[], int a3[]) {
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        List<Integer> result = new ArrayList<>();
	        while (i < a1.length && j < a2.length && k < a3.length) {
	            if (a1[i] == a2[j] && a2[j] == a3[k]) {
	                result.add(a1[i]);
	                i++;
	                j++;
	                k++;
	            } else if (a1[i] < a2[j]) {
	                i++;
	            } else if (a2[j] < a3[k]) {
	                j++;
	            } else {
	                k++;
	            }
	        }
	        return result;
	    }

	    public static void main(String args[]) {
	        int input1[] = {2, 5, 10, 20, 40, 80};
	        int input2[] = {-2, -1,1,2,6, 7, 20, 80, 100};
	        int input3[] = {-3,-2, -1,0,1, 2,3, 4, 15, 20, 30, 70, 80, 120};

	        Common c = new Common();
	        List<Integer> result = c.commonElements(input1, input2, input3);
	        System.out.println(result);
	    }


}
