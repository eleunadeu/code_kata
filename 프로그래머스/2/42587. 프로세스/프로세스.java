import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int[] sortedArray = priorities.clone();
        Arrays.sort(sortedArray);
        
        Queue<Integer> queue = new LinkedList<>();
        for (int n : priorities) {
            queue.add(n);
        }
        
        int point = priorities.length -1;
        int targetIndex = location;
        
        while (true) {
            if (sortedArray[point] == queue.peek()) {
                queue.poll();
                answer++;
                point--;
                
                if (targetIndex == 0) {
                    return answer;
                }
            } else {
                queue.offer(queue.poll());
            }
            targetIndex = targetIndex - 1 >= 0 ? targetIndex - 1 : queue.size() - 1;
        }
    }
}