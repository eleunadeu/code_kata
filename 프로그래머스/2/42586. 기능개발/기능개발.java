import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int lastDate = 0;
        int features = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int remainDate = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                remainDate++;
            }
            
            if (lastDate < remainDate) {
                if (features > 0) {
                    answer.add(features);
                }
                lastDate = remainDate;
                features = 1;
            } else {
                features++;
            }
        }
        
        if (features > 0) {
            answer.add(features);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}