package com.revature;


public class LCM {
	
	public static void main(String[] args) {
		    
		    int arr1[] = {5, 4, 6, 46, 54, 12, 13, 17}; //2744820
		    int arr2[] = {46, 54, 466, 544}; //78712992
		    int arr3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //2520
		    int arr4[] = {13, 6, 17, 18, 19, 20, 37}; //27965340
		    
		    
		    System.out.println(findLCM(arr1));
		    System.out.println(findLCM(arr2));
		    System.out.println(findLCM(arr3));
		    System.out.println(findLCM(arr4));
	}
		    
			//find Lcm
		    public static int findLCM(int arr[]) {
		    int Lcm = arr[0];
		    int Gcd = arr[0];
		 
		    
		    for(int i=1; i<arr.length; i++){
		      Gcd = findGCD(arr[i], Lcm);
		      Lcm = (Lcm * arr[i])/Gcd;
		    }
		    //System.out.println("LCM: " + Lcm);
		    return Lcm;
		  }
		    //find Gcd
		  public static int findGCD(int a, int b){
		        while (a != b) {
		        	if(a > b)
		                a = a - b;
		            else
		                b = b - a;
		        }
		        //System.out.println("GCD: " + b);
				return b;
		  }
}
