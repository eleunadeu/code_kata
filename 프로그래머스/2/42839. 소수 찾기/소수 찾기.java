import java.util.*;
class Solution {
    boolean[] isPrime;
    Set<Integer> uniqueNum = new HashSet<Integer>();
    
    public int solution(String numbers) {
        int maxNum = (int) Math.pow(10, numbers.length());
        initPrimeArray(maxNum);

        findCombinations("", numbers);

        return uniqueNum.size();
    }
    
    public void initPrimeArray(int max) {
        isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    
    public void findCombinations(String prefix, String str) {
        if (!prefix.isEmpty()) {
            int num = Integer.parseInt(prefix);
            if (isPrime[num]) {
                uniqueNum.add(num);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            findCombinations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
        }
    }
}