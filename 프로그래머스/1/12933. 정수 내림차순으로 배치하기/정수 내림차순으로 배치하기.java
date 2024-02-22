import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        String reverseStr = new StringBuilder(new String(charArr)).reverse().toString();
        answer = Long.parseLong(reverseStr);
        return answer;
    }
}