import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int size = numbers.length;
        int[] answer = new int[size];
        int index = size -1;
        answer[index--] = -1;
        
        Stack<Integer> stack = new Stack<>();
        for (int i = size-2; i >= 0; i--) {
            if (numbers[i+1] > numbers[i]) {
                stack.push(numbers[i+1]);
                answer[index--] = numbers[i+1];
            } else {
                boolean isBig = false;
                while (!stack.isEmpty()) {
                    int now = stack.peek();
                    if (now > numbers[i]) {
                        isBig = true;
                        answer[index--] = now;
                        break;
                    } else stack.pop();
                }
                if (!isBig) {
                    answer[index--] = -1;
                }
            }
        }
        return answer;
    }
}