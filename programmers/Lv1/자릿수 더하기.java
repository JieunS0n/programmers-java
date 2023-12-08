import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] num_list = String.valueOf(n).split("");
        for(String str : num_list) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}
