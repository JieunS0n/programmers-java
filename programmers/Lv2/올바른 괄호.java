import java.util.List;
import java.util.ArrayList;

class Solution {
    boolean solution(String s) { 
        if(s.charAt(0) == ')') 
            return false;

        boolean answer = true;

        List<Character> list = new ArrayList<>();
        list.add('(');

        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);

            if(list.size() <= 0){
                if(c == ')') return false;
                list.add(c);
            } else if(list.get(list.size()-1) == c) {
                list.add(c);
            } else {   
                list.remove(list.size()-1);
            }
        }

        return list.size() > 0 ? false : true;
    }
}
