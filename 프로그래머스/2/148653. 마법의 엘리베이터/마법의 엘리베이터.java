class Solution {
    public int solution(int storey) {
        String num = String.valueOf(storey);
        int size = num.length();
        int cnt = 0;
        int mul = 1;

        for (int i = size - 1; i > 0; i--) {
            int now = Integer.parseInt(String.valueOf(num.charAt(i)));
            int next = Integer.parseInt(String.valueOf(num.charAt(i - 1)));
            
            if (now < 5) {
                cnt += now;
                storey -= (now * mul);
            } else if (now == 5) {
                if (next < 5) {
                    cnt += now;
                    storey -= (now * mul);
                } else {
                    cnt += (10 - now);
                    storey += ((10 - now) * mul);
                }
            } else {
                cnt += (10 - now);
                storey += ((10 - now) * mul);
            }
            num = String.valueOf(storey);
            mul *= 10;
        }
        int last = storey/mul;
    
        if (last > 5) {
            cnt += (10 - last) + 1;
        } else cnt += last;
        return cnt;
    }
}