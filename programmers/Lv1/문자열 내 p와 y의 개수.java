class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        String[] str_list = s.toLowerCase().split("");
        
        for(String str : str_list) {
            if("p".equals(str))
                ++ pCount;
            else if("y".equals(str))
                ++ yCount;
        }
        
        return pCount == yCount;
    }
}
