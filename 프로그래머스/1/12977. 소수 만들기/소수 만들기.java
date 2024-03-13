import java.util.*;

class Solution {
    public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    public static ArrayList<ArrayList<Integer>> generateCombinations(int[] nums) {
            ArrayList<ArrayList<Integer>> combinations = new ArrayList<>();
            int n = nums.length;
            // 모든 가능한 3개의 수 조합 생성
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        combinations.add(triplet);
                    }
                }
            }
            return combinations;
        }
    
    public int solution(int[] nums) {
        int count = 0;
            ArrayList<ArrayList<Integer>> combinations = generateCombinations(nums);
            // 각 조합의 합이 소수인 경우 카운트 증가
            for (ArrayList<Integer> triplet : combinations) {
                int sum = triplet.stream().mapToInt(Integer::intValue).sum();
                if (isPrime(sum)) {
                    count++;
                }
            }
            return count;
        }
}