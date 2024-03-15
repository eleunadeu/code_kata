class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0, checkZero = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) checkZero++;
            for (int winNum : win_nums) {
                if (lottos[i] == winNum) {
                    count++;
                }
            }
        }

        answer[0] = count + checkZero;
        answer[1] = count;

        for (int k = 0; k < answer.length; k++) {
            switch (answer[k]) {
                case 6:
                    answer[k] = 1;
                    break;
                case 5:
                    answer[k] = 2;
                    break;
                case 4:
                    answer[k] = 3;
                    break;
                case 3:
                    answer[k] = 4;
                    break;
                case 2:
                    answer[k] = 5;
                    break;
                default: answer[k] = 6;
            }
        }

        return answer;
    }
}    