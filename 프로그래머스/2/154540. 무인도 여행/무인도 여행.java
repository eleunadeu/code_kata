import java.util.*;
class Solution {
    int n, m, value;
    int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
    boolean[][] isVisited;
    List<Integer> answer = new ArrayList<>();
    
    public int[] solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        isVisited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isVisited[i][j] || maps[i].charAt(j) == 'X') continue;
                dfs(i, j, maps);
                answer.add(value);
                value = 0;
            }
        }
        if (answer.isEmpty()) return new int[]{-1};
        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
    
    void dfs(int x, int y, String[] maps) {
        isVisited[x][y] = true;
        value += maps[x].charAt(y) - '0';

        for (int i = 0; i < 4; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];

            if (OOB(nx, ny) || maps[nx].charAt(ny) == 'X' || isVisited[nx][ny]) continue;
            dfs(nx, ny, maps);
        }
    }
    boolean OOB(int x, int y) {
        return x < 0 || x >= n || y < 0 || y >= m;
    }
}