import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int buyAllNum = 0;
        int discountCount = discount.length;
        boolean isDiscount = false;
        
        Map<String, Integer> wantMap = new HashMap<>();
        Map<String, Integer> checkMap = new HashMap<>();
        int wantItemCount = want.length;
        
        for(int i=0; i<wantItemCount; i++) 
        {
            wantMap.put(want[i], number[i]);    
            buyAllNum += number[i];
        }
        
        
        for(int i=0; i<discountCount; i++) 
        {
            checkMap = new HashMap<>();
            for(String key : wantMap.keySet())
                checkMap.put(key, wantMap.get(key));
            
            if((i + buyAllNum) <= discountCount) 
            {    
                for(int j=i; j < (i + buyAllNum); j++)
                {   
                    if(checkMap.containsKey(discount[j]) 
                       && checkMap.get(discount[j]) > 0) {
                        isDiscount = true;
                        checkMap.put(discount[j], checkMap.get(discount[j])-1);
                    } else {
                        isDiscount = false;
                        break;
                    } 
                }
                
                if(isDiscount)
                    answer ++;
            }
        }
        return answer;
    }
}
