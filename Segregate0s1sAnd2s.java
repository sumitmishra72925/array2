package ArrayQuestion2;

public class Segregate0s1sAnd2s {
	/*Write a program to sort an array of 0's,1's and 2's in ascending order.
	 time complexity= O(n)
	 Input :

	2
	5
	0 2 1 2 0
	3
	0 1 0
	Output:

	0 0 1 2 2
	0 0 1*/

	public static void main(String[] args) {
		int[] arr = { 0, 0, 2, 1, 2, 0, 1, 2, 2, 1, 2, 0 };
		int[] arr2 = { 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0 };
		int n = arr.length;
		int n2 = arr2.length;
		// Solution(arr,n);
		solution2(arr2, n2);

	}
		// method 1
	public static void Solution(int[] arr, int n) {
		int low = 0;
		int high = n - 1;
		int mid = 0;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int temp2 = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp2;
				high--;
				break;

			}
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
// method 2

	public static void solution2(int[] arr2, int n) {
		int left = 0;
		int right = n - 1;
		while (left < right) {
			while (arr2[left] == 0 && left < right) 
				left++;
			
			while (arr2[right] == 1 && left < right) 
				right--;
			
			if (left < right) {

				arr2[left] = 0;
				arr2[right] = 1;
				left++;
				right--;
			}
			
			}
		for (int val : arr2) {
			System.out.print(val + " ");
		}
	}

}
