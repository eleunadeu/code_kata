class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int size = s.length();
        boolean first = true;
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(' ');
                first = true;
                continue;
            }
            
            if (!first) {
                sb.append(Character.toString(c).toLowerCase());
                continue;
            }
            
            sb.append(Character.toString(c).toUpperCase());
            first = false;
        }
        
        return sb.toString();
    }
}