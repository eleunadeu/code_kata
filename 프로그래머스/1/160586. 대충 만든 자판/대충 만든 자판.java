import java.util.HashMap;
class Solution {
String[] keymap;
    public int[] solution(String[] keymap, String[] targets) {
        this.keymap =  keymap;
        int[] answer = new int[targets.length];
        HashMap<String, Integer> key = new HashMap<>();

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int j = 0;
            int count = 0;

            while (j < target.length()) {
                String str = target.charAt(j) + "";
                int cnt = key.getOrDefault(str, 0);
                if (cnt == 0) {
                    cnt = findCount(str);
                }
                key.put(str, cnt);
                if (cnt == -1) {
                    count = -1;
                    break;
                }
                count += cnt;
                j+=1;
            }
            answer[i] = count;
        }
        return answer;
    }

    public int findCount(String str){
        int minKey = 100;
        for (String key : keymap) {
            int index = key.indexOf(str);
            if (index == 0) {
                return 1;
            } else if (index == -1) {
                continue;
            } else {
                minKey = Math.min(index, minKey);
            }
        }
        if(minKey == 100 ){
            return -1;
        }else{
            return minKey += 1;
        }
    }
}    