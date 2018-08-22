package ArrayQuestion2;

import java.util.Scanner;
/*Given an unsorted array of non-negative integers, find a continuous sub-array which adds to a given number.
 * Expected Time Complexity: O(n)
 
 Input:
 	2
	5 12
	1 2 3 7 5
	10 15
	1 2 3 4 5 6 7 8 9 10
	
	Output:
	2 4
	1 5*/

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			int target = s.nextInt();
			solution(arr, target);
			t--;
		}

	}

	public static void solution(int[] arr, int sum) {
		int curr_sum = arr[0];
		int start = 0;
		for (int i = 1; i <=arr.length; i++) {
			while (curr_sum > sum && start < i-1) {
				
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if (curr_sum == sum) {
				
				System.out.println(start);
				System.out.println(i);
				break;
			}
			if (i < arr.length) {
				curr_sum += arr[i];
			}
		}

	}

}
