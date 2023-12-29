import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> lengthSumSet = new HashSet<>();
        int arrLength = elements.length;
        
        int sum = 0;
        for(int length=1; length<=arrLength; length++) {
            for(int idx=0; idx<arrLength; idx++) {
                int index = idx;
                int count = 0;
                sum = 0;
                while(count < length) {
                    sum += elements[index];
                    index = (index+1) % arrLength;
                    count ++;
                }
                lengthSumSet.add(sum);
            }
        }
        return lengthSumSet.size();
    }
}
