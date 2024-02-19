package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

 
	     
		        public static void main(String args[]){
		       
		        	for (int i = 1; i <= 6; i++) {
		        		
		        		for (int j = 1; j <= 7; j++) {
		        			
		        			if ((i==1 || i==2 || i==5||i==6||j==1 || j==2 || j==6||j==7) ) {
		        				
									System.out.print("*");
								}
								else {
									System.out.print(" ");
								}
							
		        			
							
						}
		        		System.out.println();
						
					}

		        }
		}
	
