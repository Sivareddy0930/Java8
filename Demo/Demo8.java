package Demo;

public class Demo8 {
	
	    public static void main(String[] args) {
	        int itemID = 32387634;
	        int bucket = findBucket(itemID);
	        System.out.println(bucket);
	    }

	    public static int findBucket(int itemID) {
	        // Convert the item ID to a string to iterate through its digits
	        String itemStr = Integer.toString(itemID);

	        // Initialize a variable to store the maximum digit value
	        int maxDigit = 0;

	        // Iterate through each digit in the item ID
	        for (char digitChar : itemStr.toCharArray()) {
	            // Convert the character back to an integer
	            int digit = Character.getNumericValue(digitChar);

	            // Update the maxDigit if the current digit is greater
	            if (digit > maxDigit) {
	                maxDigit = digit;
	            }
	        }

	        // The maximum digit value is the bucket for the item ID
	        return maxDigit;
	    }
	}



