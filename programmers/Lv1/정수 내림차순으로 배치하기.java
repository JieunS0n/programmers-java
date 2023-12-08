import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] numstrList= String.valueOf(n).split("");
        int length = numstrList.length;
        Integer[] numList = new Integer[length];

        for(int i=0; i<length; i++) {
            numList[i] = Integer.parseInt(numstrList[i]);
        }
        
        List<Integer> list = Arrays.asList(numList);
        Collections.sort(list);
        
        for(int i=length-1; i>=0; i--) {
            answer += list.get(i) * Math.pow(10,i);
        }
        return answer;
    }
}
