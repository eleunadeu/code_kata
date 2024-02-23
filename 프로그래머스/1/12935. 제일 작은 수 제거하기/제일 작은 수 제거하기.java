class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int minNum = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        if (arr.length == 1) {
            answer = new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            if (minNum == arr[i]) {
                continue;
            } else {
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}