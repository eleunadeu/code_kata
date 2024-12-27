import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{x, 0});
        boolean[] visited = new boolean[1000000*3];
        
        while (!que.isEmpty()) {
            int[] now = que.poll();
            
            if (now[0] == y) {
                return now[1];
            }
            
            if (!visited[now[0] + n] && now[0] + n <= y) {
                que.offer(new int[]{now[0] + n, now[1] + 1});
                visited[now[0] + n] = true;
            }
            
            if (!visited[now[0] * 2] && now[0] * 2 <= y) {
                que.offer(new int[]{now[0] * 2, now[1] + 1});
                visited[now[0] * 2] = true;
            }
            
            if (!visited[now[0] * 3] && now[0] * 3 <= y) {
                que.offer(new int[]{now[0] * 3, now[1] + 1});
                visited[now[0] * 3] = true;
            }
        }
        return -1;
    }
}