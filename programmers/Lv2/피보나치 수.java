import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        
        for(int i = 2; i <= n; i++) {
            answer = (list.get(i-2) + list.get(i-1)) % 1234567;
            list.add(answer);
        }
        
        return list.get(n);
    }
}
