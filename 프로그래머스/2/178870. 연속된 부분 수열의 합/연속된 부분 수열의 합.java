class Solution {
    public int[] solution(int[] sequence, int k) {
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        long cur = 0;
        int answerSt = -1;
        int answerEn = -1;

        for (int i : sequence) {
            end++;
            cur += i;
            if (cur < k) continue;
            if (cur == k) {
                if (min > end - start + 1) {
                    min = end - start + 1;
                    answerSt = start;
                    answerEn = end - 1;
                }
            } else {
                while (cur > k) {
                    cur -= sequence[start++];
                }
                if (cur == k) {
                    if (min > end - start + 1) {
                        min = end - start + 1;
                        answerSt = start;
                        answerEn = end - 1;
                    }
                }
            }
        }
        return new int[] {answerSt, answerEn};
    }
}