import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2,s.length());
        s = s.substring(0,s.length()-2).replace("},{","-");
        String[] array = s.split("-");
        
        Arrays.sort(array, new Comparator<String>(){
            public int compare(String o1, String o2) {        
                return Integer.compare(o1.length(), o2.length());
            }
        });        
        
        
        List<Integer> answer = new ArrayList<>();
        
        for(String x : array){
            String[] temp = x.split(",");
            for(int i = 0 ; i < temp.length;i++){
                int n = Integer.parseInt(temp[i]);
                if(!answer.contains(n))
                    answer.add(n);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
