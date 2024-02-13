import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int size = progresses.length;
        
        List<Integer> answer = new ArrayList<>();
        List<Integer> workDayList = new ArrayList<>();
        
        int workAmount = 0;
        int workDay = 0;
        
        for(int i=0; i<size; i++)
        {
            workAmount = 100 - progresses[i];
            workDay = workAmount / speeds[i];
            if(workAmount%speeds[i] > 0)
                workDay ++;
            workDayList.add(workDay);    
        }
        
        int index = 0;
        int beforeDay = workDayList.get(0);
        int curWorkDay = 0;
        answer.add(1);
        
        for(int i=1; i<workDayList.size(); i++)
        {
            curWorkDay = workDayList.get(i);
            
            if(beforeDay >= curWorkDay) {
                answer.set(index, answer.get(index) + 1);
            }
            else {
                answer.add(1);
                index ++;
            }
            
            beforeDay = beforeDay > curWorkDay ? beforeDay : curWorkDay;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
