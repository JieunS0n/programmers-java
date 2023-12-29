import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // key : weight, value : count
        Map<Integer, Integer> map = new HashMap<>(); 
        
        Integer count = null;
        for(int i = 0; i < tangerine.length; i++) {
            count = map.get(tangerine[i]);
            if(map.get(tangerine[i]) == null)
                map.put(tangerine[i], 1);
            else
                map.put(tangerine[i], ++count);
        }

        
        List<Integer> keyList = new ArrayList<>(map.keySet()); 
        keyList.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1))); // 내림차순 정렬
        
        int index = 0;
        while(k > 0) {
            k -= map.get(keyList.get(index));
            index ++;
            answer ++;
        }
        
        return answer;
    }
}
