package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public void run () {
		
		println("This program lists the Fibonacci sequence.");
		
		int Max_TERM_VALUE = 10000;
		int T1 = 0;
	    int T2 = 1;
	    
	 
	    while (T1 < Max_TERM_VALUE) {
	    
	    	println(T1); 
	    	int sum = T1 + T2;
	    	T1 = T2;
	    	T2 = sum;      
	        
	    }  
	  }	  
	}

