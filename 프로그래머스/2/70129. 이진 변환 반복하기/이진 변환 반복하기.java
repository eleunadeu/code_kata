class Solution {
    public int[] solution(String s) {
        int deleteCount = 0;
        int binaryCount = 0;
        
        while (s.length() > 1) {
            int beforeLength = s.length();
            s = s.replaceAll("0","");
            int afterLength = s.length();
            deleteCount += beforeLength - afterLength;
            s = binary("", s.length());
            binaryCount++;
        }
        
        return new int[] {binaryCount, deleteCount};
    }
    
    private String binary(String str, int length) {
        if(length == 1) return "1";
        int number = length / 2;
        int remain = length % 2;
        if (number <= 1) {
            return number + String.valueOf(remain)+str;
        }
        return binary(remain + str, number);
    }
}