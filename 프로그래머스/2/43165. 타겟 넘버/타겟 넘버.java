class Solution {
    int[] arr;
    int targetNumber, answer = 0;
    
    public int solution(int[] numbers, int target) {
        int n = numbers.length;
        arr = new int[n];
        targetNumber = target;
        
        for (int i = 0; i < n; i++) {
            arr[i] = numbers[i];
        }
        
        findTargetNumber(-1 * arr[0], 1);
        findTargetNumber(arr[0], 1);
        
        return answer;
    }
    
    public void findTargetNumber(int num, int cnt) {
        if (num == targetNumber && cnt == arr.length) {
            answer++;
            return;
        }
        if (cnt >= arr.length) return;
        
        findTargetNumber(num - arr[cnt], cnt + 1);
        findTargetNumber(num + arr[cnt], cnt + 1);
    }
}