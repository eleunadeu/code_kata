import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> matches = new HashMap<>();
        
        for (String[] clothe : clothes) {
            String category = clothe[1];
            matches.put(category, matches.getOrDefault(category, 0) +1);
        }
        
        for (String category : matches.keySet()) {
            answer *= matches.get(category) + 1;
        }
        
        return answer - 1;
    }
}