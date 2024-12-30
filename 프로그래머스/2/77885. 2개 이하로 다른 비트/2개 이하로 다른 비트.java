import java.util.*;
class Solution {
    static long[] answer;
    static StringBuilder sb = new StringBuilder();
    
    public long[] solution(long[] numbers) {
        answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            func(i, numbers[i]);
        }
        return answer;
    }
    
    public static void func(int index, long cur) {
        String str = toBinary(cur);
        int lastIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') lastIndex = i;
        }
        long result;
        int size = str.length();
        
        if (lastIndex == -1) {
            result = toLong("10" + str.substring(1, size));
        }
        else {
            if (lastIndex == str.length() - 1) {
                result = toLong(str.substring(0, size - 1) + "1");
            }
            else {
                result = toLong(str.substring(0, lastIndex) + "10" + str.substring(lastIndex + 2));
            }
        }
        answer[index] = result;
    }
    
    public static String toBinary(long num) {
        sb.setLength(0);
        while (num >= 2) {
            sb.append(num % 2);
            num /= 2;
        }
        sb.append(num);
        return sb.reverse().toString();
    }
    
    public static long toLong(String str) {
        long sum = 0;
        int cnt = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                sum += (long) Math.pow(2, cnt);
            }
            cnt++;
        }
        return sum;
    }
}