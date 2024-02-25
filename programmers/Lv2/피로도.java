class Solution {
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        DFS(k, dungeons, visited);
        return answer;
    }
    
    static void DFS(int k, int[][] dungeons, boolean[] visited)
    {
        int count = 0;
        for(int i = 0; i<visited.length; i++) {
            if(visited[i]) {
                count++;
            }
        }
        if(count > answer) {
            answer = count;
        }
        
        for(int i=0 ; i<dungeons.length; i++) 
        {        
            if(!visited[i]) {
                if(dungeons[i][0] <= k) {
                    visited[i] = true;
                    k -= dungeons[i][1];
                    DFS(k, dungeons, visited);
                    k += dungeons[i][1];
                    visited[i] = false;
                }
            }
        }
    }
}
