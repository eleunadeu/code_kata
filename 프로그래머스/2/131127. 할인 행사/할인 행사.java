import java.util.*;
class Solution {
    static HashMap<String, Integer> wants = new HashMap<>();
    static HashMap<String, Integer> discounts = new HashMap<>();
    static List<String> keys;
    public int solution(String[] want, int[] number, String[] discount) {    
        int answer = 0;
        
        for (int i = 0; i < want.length; i++) {
            wants.put(want[i], number[i]);
        } 
        keys = new ArrayList<>(wants.keySet());
        
        for (int i = 0; i < 10; i++) {
            discounts.put(discount[i], discounts.getOrDefault(discount[i], 0) + 1);
        }
        
        if (validation()) answer++;
        
        for (int i = 10; i < discount.length; i++) {
            discounts.put(discount[i - 10], discounts.get(discount[i - 10]) - 1);
            discounts.put(discount[i], discounts.getOrDefault(discount[i], 0) + 1);
            if (validation()) answer++;
        }
        
        return answer;
    }
    
    public static boolean validation() {
        for (String key : keys) {
            if (discounts.getOrDefault(key, 0) < wants.get(key)) return false;
        }
        return true;
    }
}