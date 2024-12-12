import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        Set<Integer> sumSet = new HashSet<>();
        
        for (int i = 0; i < len; i++) {
            int num = elements[i];
            sumSet.add(num);
            
            for (int j = i + 1; j < i + len; j++) {
                num += elements[j % len];
                sumSet.add(num);
            }
        }
        
        return sumSet.size();
    }
}