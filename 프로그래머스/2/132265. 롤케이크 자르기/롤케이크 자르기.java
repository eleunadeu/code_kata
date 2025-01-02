class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        int[] o1 = new int[10001];
        int[] o2 = new int[10001];
        int o1Cnt = 0;
        int o2Cnt = 0;
        
        for (int t : topping) {
            o2[t]++;
            if (o2[t] == 1) o2Cnt++;
        }
        
        for (int t : topping) {
            o1[t]++;
            if (o1[t] == 1) o1Cnt++;
            o2[t]--;
            if (o2[t] == 0) o2Cnt--;
            
            if (o1Cnt == o2Cnt) answer++;
        }
        
        return answer;
    }
}