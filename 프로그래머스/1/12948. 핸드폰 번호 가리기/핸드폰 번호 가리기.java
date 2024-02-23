class Solution {
    public String solution(String phone_number) {
        int target = phone_number.length()-4;
        String answer = phone_number.substring(0, target).
            replaceAll("[0-9]","*")+phone_number.substring(target);
        return answer;
    }
}