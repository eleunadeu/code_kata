class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        String[] splitStr = s.split(" ");
        for (String str : splitStr) {
            int check = Integer.parseInt(str);
            min = Math.min(min, check);
            max = Math.max(max, check);
        }
        
        return min + " " + max;
    }
}