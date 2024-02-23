import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a == b) {
            answer = (long) a;
        } else if (a > b) {
            answer = LongStream.rangeClosed(b, a).sum();
        } else {
            answer = LongStream.rangeClosed(a, b).sum();
        }
        return answer;
    }
}