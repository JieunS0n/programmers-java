import java.util.List;
import java.util.ArrayList;
class Solution {
    public long solution(int n) {
        long answer = 1; // n = 1일 경우 고려
        
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(1L);
        
        for(int i = 2; i <= n; i++) {
            answer = (list.get(i-2) + list.get(i-1)) % 1234567;
            list.add(answer);
            
        }
        return answer;
    }
}
