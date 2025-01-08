import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];

        int[] Y = new int[]{1, 0, -1};
        int[] X = new int[]{0, 1, -1};

        int num = 1; 
        int cnt = 0; 
        int size = n; 

        int y = -1, x = 0, move = 0;


        while (size > 0) {
            y += Y[move % 3];
            x += X[move % 3];
            triangle[y][x] = num++;
            cnt++;

            if (cnt == size) {
                cnt = 0;
                size--;
                move++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                if (triangle[i][j] != 0) {
                    list.add(triangle[i][j]);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}