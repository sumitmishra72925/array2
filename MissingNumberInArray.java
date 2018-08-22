package ArrayQuestion2;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int [] arr={1,2,4,5};
		int n=arr.length;
		//int res=solution(arr,n);
		int res=solution2(arr,n);
		
		System.out.println(res);

	} 

	/*method 1 using formula of natural  number n= n*(n+1)/2
	this method does not work when the input size is too big*/

	public static int solution(int [] arr,int n){
		int res=((n+1)*(n+2))/2 ;			 //the value of n willbe n+1 here bcz we r getting n-1 value intialy.
		int total=0;
		for(int i=0;i<n;i++)
			
			total+=arr[i];
		
		return res-total ;
	}

	/*method 2 using XOR operation first we will take XOR of every element pressent in array and store them in X1 then we will take XOR of range
	 1-n the range of the given number and store them in X2 then X1^X2=result*/
 


	public static int solution2(int [] arr,int n){
		int X1=0;
		int X2=0;
		
		for(int i=1;i<=n+1;i++)
			 X1=X1^i;
		for(int j=0;j<n;j++){
			X2=X2^arr[j];
		}
		System.out.println(X1);
		System.out.println(X2);
		int res=X1^X2;
		return res;
	}

}
