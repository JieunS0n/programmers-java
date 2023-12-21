import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> peopleList = new ArrayList<>();
        for(int person : people) {
            peopleList.add(person);
        }
        
        Collections.sort(peopleList);
        int size = peopleList.size();
        
        int sum = 0;
        int front = 0;
        int rear = size-1;
        
        while(front <= rear) {
            sum = peopleList.get(front) 
                + peopleList.get(rear);
            if(sum <= limit) {
                front ++;
                rear --;
            } else {
                rear --;
            }
            answer ++;
        }
        
        return answer;
    }
}
