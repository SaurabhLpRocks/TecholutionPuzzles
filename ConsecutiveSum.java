package com.techo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(reader.readLine());
        int numbers = consecutive(num);
        System.out.println(numbers);
	}

	private static int consecutive(long num) {
		int counter = 0;
		for(long i=1;i<=num/2;i++){
			long sum=i;
			long j=i+1;
			while((sum=sum+j) <= num){
				if(sum==num){
					counter++;
			    	break;  
			      }
				else{
					j++;
				}
			}	
			
		}
		
		
		return counter;
	}

}
