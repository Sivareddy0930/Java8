package Demo;

public class PrimeNumbersInRange {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online


	    
	    // Function to check if a number is prime
	    static boolean isPrime(int num) {
	        if (num <= 1)
	            num= -num;
	        
	        if(num==1||num==0) {
	        	return false;
	        }
	        int count =0;
	        for (int i = 2; i <= num; i++) {
	        	
	            if (num % i == 0) {
	            	count++;
	            }
	            
	            	
	        }
	        if(count==1) {
            	return true;
            }
            else {
            	return false;
            }
			
	        
	        
	    }

	    // Function to find the smallest prime number in the range
	    static int smallestPrimeInRange(int start, int end) {
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i))
	                return i;
	        }
	        return -1; // If no prime found in the range
	    }

	    // Function to find the largest prime number in the range
	    static int largestPrimeInRange(int start, int end) {
	        for (int i = end; i >= start; i--) {
	            if (isPrime(i))
	              return i;
	        }
	        return -1; // If no prime found in the range
	    }

	    public static void main(String[] args) {
	        int start = -97; // Define your range start
	        int end = 47; // Define your range end
	      
	        int smallestPrime = smallestPrimeInRange(start, end);
	        int largestPrime = largestPrimeInRange(start, end);
	        
	        if (smallestPrime != -1 && largestPrime != -1) {
	            int sum = smallestPrime + largestPrime;
	            System.out.println("Sum of smallest and largest prime numbers in the range " + start + " to " + end + " is: " + sum);
	        } else {
	            System.out.println("No prime numbers found in the range " + start + " to " + end);
	        }
	    }
	}

