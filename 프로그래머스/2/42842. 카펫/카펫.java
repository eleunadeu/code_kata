class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
        for (int width = area; width > 1; width--) {
            if (area % width == 0) {
                int height = area / width;
                if ((width * 2 + (height - 2) * 2) == brown) {
                    answer[0] = width;
                    answer[1] = height;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}