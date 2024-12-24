import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int n, int k) {
        return (int) count(change(n, k));
    }
    
    public static long count(String output) {
        return Arrays.stream(output.split("0"))
            .filter(o -> !o.isEmpty())
            .map(Long::parseLong)
            .filter(Solution::isPrime)
            .count();
    }
    
    public static boolean isPrime(long num) {
        if (num < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
            .noneMatch(i -> num % i == 0);
    }
    
    public static String change(int n, int k) {
        return k == 10 ? Integer.toString(n) : convert(n, k);
    }
    
    public static String convert(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n >= k) {
            sb.append(n % k);
            n /= k;
        }
        sb.append(n);
        return sb.reverse().toString();
    }
}