import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.rangeClosed(0, 9).
            filter(n -> Arrays.binarySearch(numbers, n) < 0).sum();
    }
}