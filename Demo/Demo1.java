package Demo;


import java.util.Arrays;

public class Demo1 {

    public static boolean isPermutation(String s1, String s2) {
      

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdbea";

        String s3 = "abcde";
        String s4 = "cdbaea";

        System.out.println(isPermutation(s1, s2));
        System.out.println(isPermutation(s3, s4));
    }
}

