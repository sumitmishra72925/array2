package ArrayQuestion2;

import java.util.Scanner;

public class LeadreInArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    int n= scn.nextInt();
	    int [] arr= new int [n];
	    for(int i=0;i<n;i++){
	        arr[i]=scn.nextInt();
	    }
	    	//Write code here
	    	
			int x= arr.length - 1
			Solution(arr, x);
			scn.close();

	}
	public static void Solution(int [] arr,int n){
		
		for(int i=0;i<n;i++){
			
			int j=n;
			while(j>i+1){
				if(arr[i]>arr[j]){
					j--;
				}else{
					continue;
				}
				
				System.out.print(arr[i]);
			}
		}
		System.out.print(arr[n]);
	}

}
