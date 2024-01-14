package Demo;

import java.util.*;

public class Demo6 {
    public static int[] getTotalExecutionTime(int n, String[] logs) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        int prevTimestamp = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int functionId = Integer.parseInt(parts[0]);
            String status = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if (status.equals("start")) {
                if (!stack.isEmpty()) {
                    // Update the execution time of the previously running function
                    result[stack.peek()] += timestamp - prevTimestamp;
                }
                stack.push(functionId);
                prevTimestamp = timestamp;
            } else {
                // Update the execution time of the current function
                result[stack.pop()] += timestamp - prevTimestamp + 1;
                prevTimestamp = timestamp + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] logs = {"0:start:0", "2:start:4", "2:end:5", "1:start:7", "1:end:10", "0:end:11"};

        int[] result = getTotalExecutionTime(n, logs);

        System.out.println(Arrays.toString(result));
    }
}
