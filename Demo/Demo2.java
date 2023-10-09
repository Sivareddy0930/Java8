package Demo;

import java.util.*;

class Demo2{

	public static String breakThePalindrome(String str) {
    	/* Length of the string */
    	int n = str.length();

    	/* Check if the length of the string is 1 */
    	if(n == 1){
        	return "";
    	}

    	/* Two pointer left and right */
    	int l = 0, r = n-1;
    	while(l < r){
        	/* If the character is 'a' increase l and decrease r */
        	if(str.charAt(l) == 'a'){
            	l++; r--;
        	}else{
            	/* If the character is not 'a' then replace it with 'a' and return the string */
            	return str.substring(0, l) + 'a' + str.substring(l + 1);
        	}
    	}

    	/* If all the characters are 'a' replace the last character with 'b' */
    	return str.substring(0, n-1) + 'b';
	}

  	/* Main driver */
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= sc.nextLine();
		System.out.print(breakThePalindrome(str));
		sc.close();
	}
}