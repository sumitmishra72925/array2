package ArrayQuestion2;

public class KardenSAlgorithm {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3,};
		int[] arrr = new int [5];
		int n = arr.length;
		int res = Solution(arr, n);
		System.out.println(res);

	}

	public static int Solution(int[] arr, int n) {
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int temp=arr[i
			
			if(temp>sum){
				sum=temp;
			}else if(i==0){
				sum=temp;
			}
			
		}
		return sum;

	}

}
