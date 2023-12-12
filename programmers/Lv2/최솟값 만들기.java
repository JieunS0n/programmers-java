import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int length = A.length;
        
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        
        for(int i=0; i<length; i++) {
            aList.add(A[i]);
            bList.add(B[i]);
        }
        
        Collections.sort(aList);
        Collections.sort(bList);
        Collections.reverse(bList);
        
        for(int i = 0; i<length; i++) {
            answer += aList.get(i) * bList.get(i);
        }
        
        return answer;
    }
}
