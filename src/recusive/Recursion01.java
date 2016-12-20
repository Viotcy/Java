package recusive;

import java.util.Arrays;

public class Recursion01 {
    //  x^n =   x         if n==1
    //      =   x^(n-1)   if n > 1
	static public long power(int x, int n){
		if (n==1) {
			return x;
		} else if (n > 1) {
			return x * power(x, n-1);
		} else {
			return -1;
		}
	}
	// n! = 1            if  n == 0    
    //    = 1            if  n == 1
	//    = n * (n-1)!   if n > 1
	    		  
	static public long factorial (int n) {
		//long ans = 1;
		if ( n < 0 )
			return -1;
		if (n ==0 || n ==1){
			return 1L;
		} else {
			return n * factorial (n-1);
		} 
	} 
	/*
	 
	  
	 
	 * 
	 */
	
	
	
	static public long fibonacci(int n){
		if (n==0)
			return 0L;
		else if (n==1)
			return 1L;
		else 
			return fibonacci(n-1) + fibonacci(n-2);  
	}
	// 0        if 箂俱计
	// 赣俱计                  if俱计
	// 程俱计  + 玡(n-1)俱计㎝
	
	static public long sum(int[] ar){
		int len = ar.length;
		if (len==0)
			return 0L;
		else if (len==1)
			return ar[0];
		else 
			return ar[len-1] + sum(Arrays.copyOf(ar, len-1));  
	}
	
	
	
	
	
}
