import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        String key = null;
        for(int i=0; i<clothes.length; i++)
        {
            key = clothes[i][1];
            if(map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else map.put(key, 1);
        }
        
        // a,b 두가지 종류의 옷이 있다고 할 때, 조합의 총 수 (a+1)(b+1)-1
        // -1을 해주는 이유는 전부 다 착용하지 않았을 때의 경우를 제외해줌
        for(String type : map.keySet()) {
            answer *= map.get(type) + 1;
        }
        return answer-1;
    }
}
