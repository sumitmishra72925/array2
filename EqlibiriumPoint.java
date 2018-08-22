package ArrayQuestion2;


public class EqlibiriumPoint {
	/*Given an array A your task is to tell at which position the equilibrium first occurs in the array. 
	  Equilibrium position in an array is a position such that the sum of elements below it is equal to
	  the sum of elements after it.
	  
	  Input:
	2
	1
	1
	5
	1 3 5 2 2
	
	Output:
	1
	3
	  */

	public static void main(String[] args) {

		int[] arr = { 3, 1, 4, 2, 5, 2, 2, 6 };
		int n = arr.length;
		int res = solution(arr, n);
		System.out.println(res);

	}

	public static int solution(int[] arr, int n) {
		int sum = 0;
		int left_sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		
		for (int i = 0; i < n; i++) {
			sum = sum - arr[i];      //total-current
			if (sum == left_sum)      //checking that whether the current i is eqilibrium or not?
				return i;			//if found return i
			left_sum += arr[i];		// if not update left sum
		}
		return -1;

	}

}
