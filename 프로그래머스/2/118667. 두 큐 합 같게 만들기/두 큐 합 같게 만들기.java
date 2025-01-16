import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int size = queue1.length + queue2.length + 1;
        long sum1 = 0L;
        long sum2 = 0L;
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();


        for (int num : queue1) {
            sum1 += num;
            que1.offer(num);
        }

        for (int num : queue2) {
            sum2 += num;
            que2.offer(num);
        }

        if (sum1 == sum2) return 0;


        int num1 = 0;
        int num2 = 0;
        int count = 0;

        while (count <= size && !que1.isEmpty() && !que2.isEmpty()) {
            num1 = que1.peek();
            num2 = que2.peek();

            if (sum1 > sum2) {
                que2.offer(que1.poll());
                sum1 -= num1;
                sum2 += num1;
            } else {
                que1.offer(que2.poll());
                sum1 += num2;
                sum2 -= num2;
            }
            count++;
            if (sum1 == sum2) return count;
        }
        return -1;
    }
}