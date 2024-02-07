package Demo;


import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println(MathChallenge(11121)); 
       
    }

    public static String MathChallenge(int num) {
        char[] digits = Integer.toString(num).toCharArray();

        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i == -1) {
            return "-1";
        }


        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

      
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        Arrays.sort(digits, i + 1, digits.length);

      
        String finalOutput = new String(digits) + "2cwrvj8f";
        StringBuilder result = new StringBuilder(finalOutput);

        for (int k = 3; k < result.length(); k += 4) {
            result.setCharAt(k, '_');
        }

        return result.toString();
    }
}
