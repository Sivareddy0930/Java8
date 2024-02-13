package Demo.pTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java PowerOf2 <n>");
            System.exit(1); // Exit with an error code
        }

        // Parse the command-line argument
        int n = Integer.parseInt(args[0]);

        // Print the table of powers of 2
        printPowersOf2(n);
    }

    private static void printPowersOf2(int n) {
        System.out.println("Powers of 2 up to 2^" + n + ":");
        int powerOf2 = 1;
        
        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + powerOf2);
            powerOf2 *= 2;
        }
    }
}
