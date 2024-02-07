import java.util.Queue;
import java.util.LinkedList;

class Solution {
    final int CACHE_HIT = 1;
    final int CACHE_MISS = 5;
    
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();
    
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for(int i=0; i<cities.length; i++)
        {
            String city = cities[i].toUpperCase();
            int size = q.size();
            
            if(q.contains(city))
            {
                q.remove(city);
                answer += CACHE_HIT;
            }
            else 
            {
                if(size >= cacheSize)
                    q.poll();
                answer += CACHE_MISS;
            }
            q.add(city);
        }
        return answer;
    }
}
