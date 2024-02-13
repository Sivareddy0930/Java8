package Demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo6 {

	  public static String stringChallenge(String str) {
	    StringBuilder sb = new StringBuilder();
	    int count = 1;
	    for (int i = 1; i < str.length(); i++) {
	      if (str.charAt(i) == str.charAt(i - 1)) {
	        count++;
	      } else {
	        sb.append(count);
	        sb.append(str.charAt(i - 1));
	        count = 1;
	      }
	    }
	    sb.append(count);
	    sb.append(str.charAt(str.length() - 1));
	    return sb.toString();
	  }

	  public static void main(String[] args) {
	    String str = "aabbcde";
	    String compressed = stringChallenge(str);

	    // Concatenate with ChallengeToken (replace with your actual token)
	    String combined = compressed + "2cwrvj8f";

	    // Replace every fourth character with an underscore
	    StringBuilder finalOutput = new StringBuilder();
	    for (int i = 0; i < combined.length(); i++) {
	      finalOutput.append(i % 4 == 3 ? '_' : combined.charAt(i));
	    }

	    System.out.println(finalOutput);
	  }
	}


