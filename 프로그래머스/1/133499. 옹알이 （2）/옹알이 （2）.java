class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] checkString = {"aya", "ye", "woo", "ma"};
        String[] sequenceString = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String word : babbling) {
            for (int i = 0; i < checkString.length; i++) {
                word = word.replaceAll(sequenceString[i], "1").replaceAll(checkString[i], " ");
            }
            if (word.trim().isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}