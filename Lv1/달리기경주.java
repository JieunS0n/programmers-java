import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        
        for (int idx = 0; idx < players.length; idx++) {
            rankMap.put(players[idx], idx);
        }
        
        for(String calling : callings) {
            int index = rankMap.get(calling);
            String temp = players[index - 1];
            players[index - 1] = players[index];
            players[index] = temp;

            rankMap.put(players[index - 1], index - 1);
            rankMap.put(players[index], index);
        }
        
        return players;
    }
}
