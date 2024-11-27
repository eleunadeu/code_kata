import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;
        int[] result = new int[n];
        boolean[][] hasReported = new boolean[n][n];
        int[] reportCount = new int[n];
        
        HashMap<String, Integer> userIndexMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            userIndexMap.put(id_list[i], i);
        }
        
        for (String s : report) {
            String[] reportDetails = s.split(" ");
            
            int reportIndex = userIndexMap.get(reportDetails[0]);
            int reportedIndex = userIndexMap.get(reportDetails[1]);
            
            if (!hasReported[reportIndex][reportedIndex]) {
                reportCount[reportedIndex] += 1;
                hasReported[reportIndex][reportedIndex] = true;
            }
        }
        
        for (int i = 0; i < n; i++) {
            int validReportCount = 0;
            for (int j = 0; j < n; j++) {
                if (hasReported[i][j] && reportCount[j] >= k) {
                    validReportCount++;
                }
            }
            result[i] = validReportCount;
        }
        
        return result;
    }
}