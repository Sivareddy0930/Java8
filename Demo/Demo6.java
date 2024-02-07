package Demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println(StringChallenge("aabbcde")); // Output: 2a2b1cidie
        System.out.println(StringChallenge("wwwbbbw")); // Output: 3w3b1w
    }

    public static String StringChallenge(String str) {
    	
    	int count=1;
    	StringBuilder str1=new StringBuilder();
    	
    	for(int i=0;i<str.length();i++) {
    		if(i< str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
    			count++;
    		}
    		else {
    			 str1 =  str1.append(count).append(str.charAt(i));
    			 count=1;
    		}
    	}
    	
    	//--------------------------------------------
    	//System.out.println(str1);
    	str1.append("2cwrvj8f");
    	
    	for(int i=3;i<str1.length();i=i+4) {
    		str1.setCharAt(i, '_');
    	}
    	
    	  	
		return str1.toString();
        
        }

        
    
}

