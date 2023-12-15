import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List<Integer> yellowFactors = new ArrayList<>();
        
        for(int i = 1; i <= yellow; i++) {
            if(yellow % i == 0)
                yellowFactors.add(i);
        }

        int size = yellowFactors.size();
        int iter = size % 2 == 0 ? size/2 : size/2 + 1;
        
        for(int i = 0; i < iter; i++) {
            if(yellowFactors.get(i) >= yellowFactors.get(size-i-1)) {
                answer[0] = yellowFactors.get(i);
                answer[1] = yellowFactors.get(size-i-1);   
            } else {
                answer[0] = yellowFactors.get(size-i-1);   
                answer[1] = yellowFactors.get(i);
            }
            
            if((answer[0] + answer[1]) * 2 + 4 == brown) {
                answer[0] += 2;
                answer[1] += 2;
                break;
            }
                
        }
        return answer;
    }
}
