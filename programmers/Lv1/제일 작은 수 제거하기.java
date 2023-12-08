import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        if(length <= 1)
            return new int[]{-1};
        
        List<Integer> arrList = new ArrayList<>();
        for(int num : arr) {
            arrList.add(num);
        }
        
        int min = Collections.min(arrList);
        arrList.remove(arrList.indexOf(min));
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
