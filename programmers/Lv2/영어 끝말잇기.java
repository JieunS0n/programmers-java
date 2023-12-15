import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        Map<String, Integer> map = new HashMap<>();
        int length = words.length;
        
        String word = "";
        for(int i=0; i<length; i++) {
            if(!word.isEmpty()
               && !word.equals(words[i].substring(0,1))) {
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = (i+1) % n != 0 ? (i+1) / n + 1 : (i+1) / n;
                break;
            }
            
            if (map.containsKey(words[i]) == true) {  
                System.out.println(i);
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = (i+1) % n != 0 ? (i+1) / n + 1 : (i+1) / n;
                break;
            }
            
            word = words[i];
            word = word.substring(word.length()-1);
            
            map.put(words[i], i);
        }
        
        return answer;
    }
}
